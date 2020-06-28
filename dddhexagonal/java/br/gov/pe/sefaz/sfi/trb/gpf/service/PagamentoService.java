package br.gov.pe.sefaz.sfi.trb.gpf.service;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;

public interface PagamentoService {
	
	public void apropriarPagamento(IDPOPagamento payload);
	public void deaspropriarPagamento(IDPOPagamento payload);
}
