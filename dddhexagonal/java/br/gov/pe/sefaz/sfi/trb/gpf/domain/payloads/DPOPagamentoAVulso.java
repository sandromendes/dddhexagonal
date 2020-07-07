package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoAVulso extends DPOPagamento implements IDPOPagamento{
	private OTDValores rateio;

	public DPOPagamentoAVulso(OTDDebitosFiscais debito, OTDDocumentoArrecadado dae) {
		super();
		this.dpoCalculos = new DPOCalculos();
		this.debito = debito;
		super.dae = dae;
	}

	public OTDValores getRateio() {
		return rateio;
	}

	public void setRateio(OTDValores rateio) {
		this.rateio = rateio;
	}

	@Override
	public void ratear() {
		OTDProcessoFiscal dadosProcesso = debito.getDadosProcesso();

		OTDValores saldo = new OTDValores(dadosProcesso.getSaldo());

		this.setRateio(this.dpoCalculos.ratearPorRubricas(saldo, this.getDae().getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		return null;
	}

	@Override
	public OTDValores calcularReducoes() {
		return null;
	}

	@Override
	public void validar() {

	}

	@Override
	public DPOPagamento getDadosPagamento() {
		return this;
	}
}
