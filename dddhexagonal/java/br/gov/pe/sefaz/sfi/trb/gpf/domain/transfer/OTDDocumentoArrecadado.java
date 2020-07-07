package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.math.BigDecimal;
import java.util.Date;

public class OTDDocumentoArrecadado {
	
	private String nuDocumentoArrecadado;
	private String nuParcela;
	private Date dtVencimento;
	private Date dtPagamento;
	private BigDecimal vlPagamento;
	
	public OTDDocumentoArrecadado() {
		super();
	}

	public OTDDocumentoArrecadado(String nuDocumentoArrecadado, String nuParcela, Date dtVencimento, Date dtPagamento,
			BigDecimal vlPagamento) {
		super();
		this.nuDocumentoArrecadado = nuDocumentoArrecadado;
		this.nuParcela = nuParcela;
		this.dtVencimento = dtVencimento;
		this.dtPagamento = dtPagamento;
		this.vlPagamento = vlPagamento;
	}

	public String getNuDocumentoArrecadado() {
		return nuDocumentoArrecadado;
	}

	public void setNuDocumentoArrecadado(String nuDocumentoArrecadado) {
		this.nuDocumentoArrecadado = nuDocumentoArrecadado;
	}

	public String getNuParcela() {
		return nuParcela;
	}

	public void setNuParcela(String nuParcela) {
		this.nuParcela = nuParcela;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Date getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public BigDecimal getVlPagamento() {
		return vlPagamento;
	}

	public void setVlPagamento(BigDecimal vlPagamento) {
		this.vlPagamento = vlPagamento;
	}
}
