package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;

public class VOProcessoParcelamento {
	
	Protocolo processo;
	Protocolo parcelamento;
	ParcelasConcedidas concedidas;
	ParcelasSolicitadas solicitadas;
	
	public VOProcessoParcelamento() {
		super();
	}

	public VOProcessoParcelamento(Protocolo processo, Protocolo parcelamento, ParcelasConcedidas concedidas,
			ParcelasSolicitadas solicitadas) {
		super();
		this.processo = processo;
		this.parcelamento = parcelamento;
		this.concedidas = concedidas;
		this.solicitadas = solicitadas;
	}

	public Protocolo getProcesso() {
		return processo;
	}

	public void setProcesso(Protocolo processo) {
		this.processo = processo;
	}

	public Protocolo getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(Protocolo parcelamento) {
		this.parcelamento = parcelamento;
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