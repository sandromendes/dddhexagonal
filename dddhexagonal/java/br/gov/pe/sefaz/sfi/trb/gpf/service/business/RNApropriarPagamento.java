package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;

public class RNApropriarPagamento {

	// Inicialização do tipo EAGER (apressada)
	private static final RNApropriarPagamento instancia = new RNApropriarPagamento();

	private RNApropriarPagamento() {
	}

	public static RNApropriarPagamento getInstance() {
		return instancia;
	}

	public void executar(IDPOPagamento payload) {

	}
}
