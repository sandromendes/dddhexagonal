package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;

public class RNDesapropriarPagamento {

	// Inicialização do tipo EAGER (apressada)
	private static final RNDesapropriarPagamento instancia = new RNDesapropriarPagamento();

	private RNDesapropriarPagamento() {
	}

	public static RNDesapropriarPagamento getInstance() {
		return instancia;
	}

	public void executar(IDPOPagamento payload) {

	}
}
