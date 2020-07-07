package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;

public class VOProcessoPrimario {

	Protocolo protocolo;
	QuantidadeInfracoes qtdInfracoes;
	
	public VOProcessoPrimario() {
		super();
	}

	public VOProcessoPrimario(Protocolo protocolo, QuantidadeInfracoes qtdInfracoes) {
		super();
		this.protocolo = protocolo;
		this.qtdInfracoes = qtdInfracoes;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public QuantidadeInfracoes getQtdInfracoes() {
		return qtdInfracoes;
	}

	public void setQtdInfracoes(QuantidadeInfracoes qtdInfracoes) {
		this.qtdInfracoes = qtdInfracoes;
	}
	
	public static class QuantidadeInfracoes {
		int quantidade;
		
		public QuantidadeInfracoes(int quantidade) {
			this.quantidade = quantidade;
		}
	}
}
