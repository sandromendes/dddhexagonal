package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.util.ArrayList;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoAVista extends DPOPagamento implements IDPOPagamento {

	private OTDValores rateio;
	
	public DPOPagamentoAVista(OTDDebitosFiscais debito) {
		super();
		this.debito = debito;
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
		
		this.setRateio(this.dpoCalculos.ratearPorRubricas(saldo, this.getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OTDValores calcularReducoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validar() {
		// TODO Auto-generated method stub
		
	}

}
