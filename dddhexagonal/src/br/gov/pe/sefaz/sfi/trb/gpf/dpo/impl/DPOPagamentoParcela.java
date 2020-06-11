package br.gov.pe.sefaz.sfi.trb.gpf.dpo.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOCalculos;
import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoParcela implements IDPOPagamento {

	private String nuDocumentoArrecadado;
	private List<VOProcessoPrimario> processosPrimarios;
	private VOProcessoParcelamento parcelamento;
	private List<VOParcelamentoParcela> parcelas;
	private String nuParcela;
	private Date dtVencimento;
	private Date dtPagamento;
	private BigDecimal vlPagamento;
	private List<OTDValores> rateio;
	private List<OTDValores> saldos;
	private IDPOCalculos dpoCalculos;
	
	public DPOPagamentoParcela(IDPOCalculos dpoCalculos, List<OTDValores> saldos) {
		super();
		this.dpoCalculos = dpoCalculos;
		this.saldos = saldos;
	}
	
	public String getNuDocumentoArrecadado() {
		return nuDocumentoArrecadado;
	}

	public void setNuDocumentoArrecadado(String nuDocumentoArrecadado) {
		this.nuDocumentoArrecadado = nuDocumentoArrecadado;
	}

	public List<VOProcessoPrimario> getProcessosPrimarios() {
		return processosPrimarios;
	}

	public void setProcessosPrimarios(List<VOProcessoPrimario> processosPrimarios) {
		this.processosPrimarios = processosPrimarios;
	}

	public VOProcessoParcelamento getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(VOProcessoParcelamento parcelamento) {
		this.parcelamento = parcelamento;
	}

	public List<VOParcelamentoParcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<VOParcelamentoParcela> parcelas) {
		this.parcelas = parcelas;
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

	public List<OTDValores> getRateio() {
		return rateio;
	}

	public void setRateio(List<OTDValores> rateio) {
		this.rateio = rateio;
	}
	
	public List<OTDValores> getSaldos() {
		return saldos;
	}

	public void setSaldos(List<OTDValores> saldos) {
		this.saldos = saldos;
	}

	public void ratear() {
		this.setRateio(this.dpoCalculos
				.ratearPorProcessos(this.getSaldos(), this.getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValoreLiquidacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OTDValores calcularReducoes() {
		// TODO Auto-generated method stub
		return null;
	}
}
