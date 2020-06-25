package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.util.List;

public class OTDDAEUnico {
	
	public List<OTDProcessoFiscal> listaDadosProcessos;

	public OTDDAEUnico() {
		super();
	}

	public OTDDAEUnico(List<OTDProcessoFiscal> listaDadosProcessos) {
		super();
		this.listaDadosProcessos = listaDadosProcessos;
	}

	public List<OTDProcessoFiscal> getListaDadosProcessos() {
		return listaDadosProcessos;
	}

	public void setListaDadosProcessos(List<OTDProcessoFiscal> listaDadosProcessos) {
		this.listaDadosProcessos = listaDadosProcessos;
	} 
}
