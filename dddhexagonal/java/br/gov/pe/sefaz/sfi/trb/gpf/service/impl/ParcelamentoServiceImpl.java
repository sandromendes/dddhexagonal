package br.gov.pe.sefaz.sfi.trb.gpf.service.impl;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.ParcelamentoService;
import br.gov.pe.sefaz.sfi.trb.gpf.service.business.RNFormalizarParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.business.RNFormalizarRegularizacaoDebitos;

public class ParcelamentoServiceImpl implements ParcelamentoService{

	public void formalizarParcelamento(IDPOParcelamento payload) {
		RNFormalizarParcelamento.getInstance().executar(payload);
	}

	public void formalizarRegularizacaoDebitos(IDPOParcelamento payload) {
		RNFormalizarRegularizacaoDebitos.getInstance().executar(payload);		
	}
}
