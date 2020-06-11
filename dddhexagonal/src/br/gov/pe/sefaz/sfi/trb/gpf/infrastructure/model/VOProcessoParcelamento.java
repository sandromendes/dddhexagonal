package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

public class VOProcessoParcelamento {
	
	Protocolo protocolo;
	ParcelasConcedidas concedidas;
	ParcelasSolicitadas solicitadas;
	
	public VOProcessoParcelamento() {
		super();
	}

	public VOProcessoParcelamento(Protocolo protocolo, ParcelasConcedidas concedidas, 
			ParcelasSolicitadas solicitadas) {
		super();
		this.protocolo = protocolo;
		this.concedidas = concedidas;
		this.solicitadas = solicitadas;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public ParcelasConcedidas getConcedidas() {
		return concedidas;
	}

	public void setConcedidas(ParcelasConcedidas concedidas) {
		this.concedidas = concedidas;
	}

	public ParcelasSolicitadas getSolicitadas() {
		return solicitadas;
	}

	public void setSolicitadas(ParcelasSolicitadas solicitadas) {
		this.solicitadas = solicitadas;
	}
	
}

class ParcelasConcedidas {
	Long parcelas;
}

class ParcelasSolicitadas {
	Long parcelas;
}