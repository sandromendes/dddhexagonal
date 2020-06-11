package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import java.math.BigDecimal;

public class VOParcelamentoParcela {

	Protocolo protocolo;
	Numero numero;
	Valor valor;
	
	public VOParcelamentoParcela() {
		super();
	}

	public VOParcelamentoParcela(Protocolo protocolo, Numero numero, Valor valor) {
		super();
		this.protocolo = protocolo;
		this.numero = numero;
		this.valor = valor;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}
}

class Numero {
	String nuParcela;
}

class Valor {
	BigDecimal vlParcela;
}
