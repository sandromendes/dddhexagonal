package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoParcela extends DPOPagamento implements IDPOPagamento {

	private List<OTDValores> rateio;
	
	public DPOPagamentoParcela(OTDDebitosFiscais debito, OTDDocumentoArrecadado dae) {
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
		List<OTDProcessoFiscal> listaDadosProcesso = debito.getDadosParcelamento()
				.getListaDadosProcessos();
		
		List<OTDValores> saldos = new ArrayList<>();
		
		for (OTDProcessoFiscal otdProcessoFiscal : listaDadosProcesso) {
			saldos.add(new OTDValores(otdProcessoFiscal.getSaldo()));
		}
		
		this.setRateio(this.dpoCalculos.ratearPorProcessos(saldos, this.getDae().getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		OTDParcelamento dadosParcelamento = this.debito.getDadosParcelamento();
		
		List<OTDProcessoFiscal> debitosFiscais = dadosParcelamento.getListaDadosProcessos();
		
		OTDValoresLiquidacaoPagamento liquidarParcelamento = new OTDValoresLiquidacaoPagamento();
		
		for (OTDProcessoFiscal otdProcessoFiscal : debitosFiscais) {
			OTDValoresLiquidacaoPagamento liquidacaoProcesso = new 
					OTDValoresLiquidacaoPagamento(otdProcessoFiscal.getSaldo());

			liquidacaoProcesso.setReducoes(this.calcularReducoes());
			
			liquidarParcelamento.add(liquidacaoProcesso);
		}

		return liquidarParcelamento;
	}

	@Override
	public OTDValores calcularReducoes() {
		OTDValores reducoes = new OTDValores();
		
		if(this.dae.getNuParcela().equals("1")) {
			reducoes.setVlPrincipal(BigDecimal.ZERO);
			reducoes.setVlJuros(new BigDecimal(50));
			reducoes.setVlMulta(new BigDecimal(30));
			reducoes.setVlHonorarios(BigDecimal.ZERO);
			reducoes.setVlJurosHonorarios(new BigDecimal(50));
			reducoes.setVlMultaHonorarios(new BigDecimal(30));
		} else {
			reducoes.setVlPrincipal(BigDecimal.ZERO);
			reducoes.setVlJuros(BigDecimal.ZERO);
			reducoes.setVlMulta(BigDecimal.ZERO);
			reducoes.setVlHonorarios(BigDecimal.ZERO);
			reducoes.setVlJurosHonorarios(BigDecimal.ZERO);
			reducoes.setVlMultaHonorarios(BigDecimal.ZERO);
		}
		
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
