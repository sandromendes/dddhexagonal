package br.gov.pe.sefaz.sfi.trb.gpf.service.impl;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.PagamentoService;
import br.gov.pe.sefaz.sfi.trb.gpf.service.business.RNApropriarPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.business.RNDesapropriarPagamento;

public class PagamentoServiceImpl implements PagamentoService{

	@Override
	public void apropriarPagamento(IDPOPagamento payload) {
		RNApropriarPagamento.getInstance().executar(payload);
	}

	@Override
	public void deaspropriarPagamento(IDPOPagamento payload) {
		RNDesapropriarPagamento.getInstance().executar(payload);
	}
}
