package br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoInfracao;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public interface IDPOImplantacao {
	public List<VOProcessoInfracao> getInfracoes();
	public VOProcesso getProcesso();
	public VOProcessoPrimario getProcessoPrimario();
	public VOProcessoSaldo getSaldo();
}
