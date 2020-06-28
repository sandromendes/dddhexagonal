package br.gov.pe.sefaz.sfi.trb.gpf.service;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;

public interface ParcelamentoService {
	
	public void formalizarParcelamento(IDPOParcelamento payload);
	public void formalizarRegularizacaoDebitos(IDPOParcelamento payload);

}
