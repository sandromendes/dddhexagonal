package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOCalculos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;

public abstract class DPOPagamento {

	protected OTDDebitosFiscais debito;
	protected IDPOCalculos dpoCalculos;
	protected String nuDocumentoArrecadado;
	protected String nuParcela;
	protected Date dtVencimento;
	protected Date dtPagamento;
	protected BigDecimal vlPagamento;
	
	public DPOPagamento() {
		super();
	}

	public DPOPagamento(OTDDebitosFiscais debito, IDPOCalculos dpoCalculos, String nuDocumentoArrecadado,
			String nuParcela, Date dtVencimento, Date dtPagamento, BigDecimal vlPagamento) {
		super();
		this.debito = debito;
		this.dpoCalculos = dpoCalculos;
		this.nuDocumentoArrecadado = nuDocumentoArrecadado;
		this.nuParcela = nuParcela;
		this.dtVencimento = dtVencimento;
		this.dtPagamento = dtPagamento;
		this.vlPagamento = vlPagamento;
	}

	public OTDDebitosFiscais getDebito() {
		return debito;
	}

	public void setDebito(OTDDebitosFiscais debito) {
		this.debito = debito;
	}

	public IDPOCalculos getDpoCalculos() {
		return dpoCalculos;
	}

	public void setDpoCalculos(IDPOCalculos dpoCalculos) {
		this.dpoCalculos = dpoCalculos;
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
