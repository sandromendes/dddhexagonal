package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoAVista extends DPOPagamento implements IDPOPagamento {

	private OTDValores rateio;
	
	public DPOPagamentoAVista(OTDDebitosFiscais debito, OTDDocumentoArrecadado dae) {
		super();
		this.dpoCalculos = new DPOCalculos();
		this.debito = debito;
		super.dae = dae;
	}
	
	public OTDValores getRateio() {
		return rateio;
	}

	public void setRateio(OTDValores rateio) {
		this.rateio = rateio;
	}

	@Override
	public void ratear() {
		OTDProcessoFiscal dadosProcesso = debito.getDadosProcesso();
		
		OTDValores saldo = new OTDValores(dadosProcesso.getSaldo());
		
		this.setRateio(this.dpoCalculos.ratearPorRubricas(saldo, this.getDae().getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		OTDValoresLiquidacaoPagamento liquidacao = new 
				OTDValoresLiquidacaoPagamento(this.debito.getDadosProcesso().getSaldo());

		liquidacao.setReducoes(this.calcularReducoes());
		return liquidacao;
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
