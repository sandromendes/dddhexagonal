package br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model;

import java.math.BigDecimal;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;

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

	public static class Principal {
		BigDecimal value;

		public Principal(BigDecimal value) {
			this.value = value;
		}

		public BigDecimal value() {
			return this.value;
		}
	}
	
	public static class Multa { 
		BigDecimal value;

		public Multa(BigDecimal value) {
			this.value = value;
		}
		
		public BigDecimal value() {
			return this.value;
		}
	}
	
	public static class Juros {
		BigDecimal value;

		public Juros(BigDecimal value) {
			this.value = value;
		}
		
		public BigDecimal value() {
			return this.value;
		}
	}
	
	public static class PrincipalHonorarios {
		BigDecimal value;

		public PrincipalHonorarios(BigDecimal value) {
			this.value = value;
		}

		public BigDecimal value() {
			return this.value;
		}
	}
	
	public static class MultaHonorarios {
		BigDecimal value;
		
		public MultaHonorarios(BigDecimal value) {
			this.value = value;
		}

		public BigDecimal value() {
			return this.value;
		}
	}
	
	public static class JurosHonorarios {
		BigDecimal value;
		
		public JurosHonorarios(BigDecimal value) {
			this.value = value;
		}

		public BigDecimal value() {
			return this.value;
		}
	}
}
