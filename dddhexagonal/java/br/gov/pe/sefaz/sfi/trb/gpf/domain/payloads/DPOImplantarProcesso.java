package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOImplantacao;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoInfracao;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public class DPOImplantarProcesso implements IDPOImplantacao {
	
	private OTDDebitosFiscais debito;
	
	public DPOImplantarProcesso(OTDDebitosFiscais debito) {
		super();
		this.debito = debito;
	}

	@Override
	public List<VOProcessoInfracao> getInfracoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOProcesso getProcesso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOProcessoPrimario getProcessoPrimario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOProcessoSaldo getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

}
