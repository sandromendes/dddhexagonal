package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;

public class VOProcessoParcelamento {
	
	Protocolo parcelamento;
	ParcelasConcedidas concedidas;
	ParcelasSolicitadas solicitadas;
	
	public VOProcessoParcelamento() {
		super();
	}

	public VOProcessoParcelamento(Protocolo parcelamento, ParcelasConcedidas concedidas,
			ParcelasSolicitadas solicitadas) {
		super();
		this.parcelamento = parcelamento;
		this.concedidas = concedidas;
		this.solicitadas = solicitadas;
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

	public static class ParcelasConcedidas {
		int parcelas;
		
		public ParcelasConcedidas(int parcelas) {
			this.parcelas = parcelas;
		}
	}
	
	public static class ParcelasSolicitadas {
		int parcelas;
		
		public ParcelasSolicitadas(int parcelas) {
			this.parcelas = parcelas;
		}
	}
}


