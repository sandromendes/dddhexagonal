package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoAVistaEspecial implements IDPOPagamento{

	private OTDDebitosFiscais debito;
	
	public DPOPagamentoAVistaEspecial(OTDDebitosFiscais debito) {
		super();
		this.debito = debito;
	}

	@Override
	public void ratear() {
		// TODO Auto-generated method stub
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValoreLiquidacao() {
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
