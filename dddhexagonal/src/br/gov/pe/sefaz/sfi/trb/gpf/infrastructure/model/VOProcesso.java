package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import java.util.Date;

public class VOProcesso {

	public Protocolo protocolo;
	public DataCiencia dataCiencia;
	public NumeroDocumento contribuinte;
	
	public VOProcesso() {
		super();
	}

	public VOProcesso(Protocolo protocolo, DataCiencia dataCiencia, NumeroDocumento contribuinte) {
		super();
		this.protocolo = protocolo;
		this.dataCiencia = dataCiencia;
		this.contribuinte = contribuinte;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public DataCiencia getDataCiencia() {
		return dataCiencia;
	}

	public void setDataCiencia(DataCiencia dataCiencia) {
		this.dataCiencia = dataCiencia;
	}

	public NumeroDocumento getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(NumeroDocumento contribuinte) {
		this.contribuinte = contribuinte;
	}
	
	public static class Protocolo {
		String nuProtocolo;
		
		public Protocolo(String nuProtocolo) {
			this.nuProtocolo = nuProtocolo;
		}
	}
	
	public static class DataCiencia {
		Date data;
		
		public DataCiencia(Date data) {
			this.data = data;
		}
	}
	
	public static class NumeroDocumento {
		String contribuinte;

		public NumeroDocumento(String contribuinte) {
			this.contribuinte = contribuinte;
		}
	}
}

