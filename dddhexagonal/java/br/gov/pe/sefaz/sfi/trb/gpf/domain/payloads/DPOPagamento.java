package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOCalculos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;

public abstract class DPOPagamento {

	protected OTDDebitosFiscais debito;
	protected IDPOCalculos dpoCalculos;
	protected OTDDocumentoArrecadado dae;
	
	public DPOPagamento() {
		super();
	}

	public DPOPagamento(OTDDebitosFiscais debito, IDPOCalculos dpoCalculos, OTDDocumentoArrecadado dae) {
		super();
		this.debito = debito;
		this.dpoCalculos = dpoCalculos;
		this.dae = dae;
	}

	public OTDDebitosFiscais getDebito() {
		return debito;
	}

	public void setDebito(OTDDebitosFiscais debito) {
		this.debito = debito;
	}

	public IDPOCalculos getDpoCalculos() {
		return dpoCalculos;
	}

	public void setDpoCalculos(IDPOCalculos dpoCalculos) {
		this.dpoCalculos = dpoCalculos;
	}

	public OTDDocumentoArrecadado getDae() {
		return dae;
	}

	public void setDae(OTDDocumentoArrecadado dae) {
		this.dae = dae;
	}

}
