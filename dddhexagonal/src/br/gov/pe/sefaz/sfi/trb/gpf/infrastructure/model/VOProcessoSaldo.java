package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import java.math.BigDecimal;

public class VOProcessoSaldo {

	Protocolo protocolo;
	Principal principal;
	Multa multa;
	Juros juros;
	PrincipalHonorarios principalHonorarios;
	MultaHonorarios multaHonorarios;
	JurosHonorarios jurosHonorarios;
	
	public VOProcessoSaldo() {
		super();
	}

	public VOProcessoSaldo(Protocolo protocolo, Principal principal, Multa multa, Juros juros,
			PrincipalHonorarios principalHonorarios, MultaHonorarios multaHonorarios, JurosHonorarios jurosHonorarios) {
		super();
		this.protocolo = protocolo;
		this.principal = principal;
		this.multa = multa;
		this.juros = juros;
		this.principalHonorarios = principalHonorarios;
		this.multaHonorarios = multaHonorarios;
		this.jurosHonorarios = jurosHonorarios;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
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

	public PrincipalHonorarios getPrincipalHonorarios() {
		return principalHonorarios;
	}

	public void setPrincipalHonorarios(PrincipalHonorarios principalHonorarios) {
		this.principalHonorarios = principalHonorarios;
	}

	public MultaHonorarios getMultaHonorarios() {
		return multaHonorarios;
	}

	public void setMultaHonorarios(MultaHonorarios multaHonorarios) {
		this.multaHonorarios = multaHonorarios;
	}

	public JurosHonorarios getJurosHonorarios() {
		return jurosHonorarios;
	}

	public void setJurosHonorarios(JurosHonorarios jurosHonorarios) {
		this.jurosHonorarios = jurosHonorarios;
	}

}

class Principal {
	BigDecimal principal;
}

class Multa { 
	BigDecimal multa;
}

class Juros {
	BigDecimal juros;
}

class PrincipalHonorarios {
	BigDecimal principal;
}

class MultaHonorarios {
	BigDecimal multa;
}

class JurosHonorarios {
	BigDecimal juros;
}