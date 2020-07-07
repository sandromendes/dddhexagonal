package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDAEUnico;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoDAEUnico extends DPOPagamento implements IDPOPagamento {

	private List<OTDValores> rateio;

	public DPOPagamentoDAEUnico(OTDDebitosFiscais debito, OTDDocumentoArrecadado dae) {
		super();
		this.dpoCalculos = new DPOCalculos();
		this.debito = debito;
		super.dae = dae;
	}
	
	public List<OTDValores> getRateio() {
		return rateio;
	}

	public void setRateio(List<OTDValores> rateio) {
		this.rateio = rateio;
	}

	@Override
	public void ratear() {
		List<OTDProcessoFiscal> listaDadosProcesso = debito.getDadosDAEUnico()
				.getListaDadosProcessos();
		
		List<OTDValores> saldos = new ArrayList<>();
		
		for (OTDProcessoFiscal otdProcessoFiscal : listaDadosProcesso) {
			saldos.add(new OTDValores(otdProcessoFiscal.getSaldo()));
		}
		
		this.setRateio(this.dpoCalculos.ratearPorProcessos(saldos, this.getDae().getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		OTDDAEUnico dadosDAEUnico = this.debito.getDadosDAEUnico();
		
		List<OTDProcessoFiscal> debitosFiscais = dadosDAEUnico.getListaDadosProcessos();
		
		OTDValoresLiquidacaoPagamento liquidacaoDAEUnico = new OTDValoresLiquidacaoPagamento();
		
		for (OTDProcessoFiscal otdProcessoFiscal : debitosFiscais) {
			OTDValoresLiquidacaoPagamento liquidacaoProcesso = new 
					OTDValoresLiquidacaoPagamento(otdProcessoFiscal.getSaldo());

			liquidacaoProcesso.setReducoes(this.calcularReducoes());
			
			liquidacaoDAEUnico.add(liquidacaoProcesso);
		}

		return liquidacaoDAEUnico;
	}

	@Override
	public OTDValores calcularReducoes() {
		OTDValores reducoes = new OTDValores();
		reducoes.setVlPrincipal(BigDecimal.ZERO);
		reducoes.setVlJuros(new BigDecimal(50));
		reducoes.setVlMulta(new BigDecimal(30));
		reducoes.setVlHonorarios(BigDecimal.ZERO);
		reducoes.setVlJurosHonorarios(new BigDecimal(50));
		reducoes.setVlMultaHonorarios(new BigDecimal(30));
		
		return reducoes;
	}

	@Override
	public void validar() {
		
	}

	@Override
	public DPOPagamento getDadosPagamento() {
		return this;
	}

}
