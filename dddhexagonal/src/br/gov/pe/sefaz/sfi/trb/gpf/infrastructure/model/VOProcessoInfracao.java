package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

public class VOProcessoInfracao {
	
	Protocolo processo;
	PeriodoFiscal periodo;
	Infracao infracao;
	Principal principal;
	Multa multa;
	Juros juros;
	
	public VOProcessoInfracao() {
		super();
	}

	public VOProcessoInfracao(Protocolo processo, PeriodoFiscal periodo, Infracao infracao, Principal principal,
			Multa multa, Juros juros) {
		super();
		this.processo = processo;
		this.periodo = periodo;
		this.infracao = infracao;
		this.principal = principal;
		this.multa = multa;
		this.juros = juros;
	}

	public Protocolo getProcesso() {
		return processo;
	}

	public void setProcesso(Protocolo processo) {
		this.processo = processo;
	}

	public PeriodoFiscal getPeriodo() {
		return periodo;
	}

	public void setPeriodo(PeriodoFiscal periodo) {
		this.periodo = periodo;
	}

	public Infracao getInfracao() {
		return infracao;
	}

	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Multa getMulta() {
		return multa;
	}

	public void setMulta(Multa multa) {
		this.multa = multa;
	}

	public Juros getJuros() {
		return juros;
	}

	public void setJuros(Juros juros) {
		this.juros = juros;
	}
	
}

class PeriodoFiscal { 
	String periodo;
}

class Infracao {
	Short codigo;
}