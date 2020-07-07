package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.math.BigDecimal;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public class OTDValores {

	BigDecimal vlPrincipal;
	BigDecimal vlMulta;
	BigDecimal vlJuros;
	BigDecimal vlHonorarios;
	BigDecimal vlMultaHonorarios;
	BigDecimal vlJurosHonorarios;
	
	public OTDValores() {
		super();
	}

	public OTDValores(VOProcessoSaldo saldo) {
		super();
		this.vlPrincipal = saldo.getPrincipal().value();
		this.vlMulta = saldo.getMulta().value();
		this.vlJuros = saldo.getJuros().value();
		this.vlHonorarios = saldo.getPrincipalHonorarios().value();
		this.vlMultaHonorarios = saldo.getMultaHonorarios().value();
		this.vlJurosHonorarios = saldo.getJurosHonorarios().value();
	}

	public BigDecimal getVlPrincipal() {
		return vlPrincipal;
	}

	public void setVlPrincipal(BigDecimal vlPrincipal) {
		this.vlPrincipal = vlPrincipal;
	}

	public BigDecimal getVlMulta() {
		return vlMulta;
	}

	public void setVlMulta(BigDecimal vlMulta) {
		this.vlMulta = vlMulta;
	}

	public BigDecimal getVlJuros() {
		return vlJuros;
	}

	public void setVlJuros(BigDecimal vlJuros) {
		this.vlJuros = vlJuros;
	}

	public BigDecimal getVlHonorarios() {
		return vlHonorarios;
	}

	public void setVlHonorarios(BigDecimal vlHonorarios) {
		this.vlHonorarios = vlHonorarios;
	}

	public BigDecimal getVlMultaHonorarios() {
		return vlMultaHonorarios;
	}

	public void setVlMultaHonorarios(BigDecimal vlMultaHonorarios) {
		this.vlMultaHonorarios = vlMultaHonorarios;
	}

	public BigDecimal getVlJurosHonorarios() {
		return vlJurosHonorarios;
	}

	public void setVlJurosHonorarios(BigDecimal vlJurosHonorarios) {
		this.vlJurosHonorarios = vlJurosHonorarios;
	}
	
}
