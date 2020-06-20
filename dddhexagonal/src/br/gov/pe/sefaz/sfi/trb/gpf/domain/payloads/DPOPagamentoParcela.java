package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.util.ArrayList;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoParcela extends DPOPagamento implements IDPOPagamento {

	private List<OTDValores> rateio;
	
	public DPOPagamentoParcela(OTDDebitosFiscais debito) {
		super();
		this.dpoCalculos = new DPOCalculos();
		this.debito = debito;
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
		
		List<OTDValores> saldos = new ArrayList<OTDValores>();
		
		for (OTDProcessoFiscal otdProcessoFiscal : listaDadosProcesso) {
			saldos.add(new OTDValores(otdProcessoFiscal.getSaldo()));
		}
		
		this.setRateio(this.dpoCalculos.ratearPorProcessos(saldos, this.getVlPagamento()));
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
