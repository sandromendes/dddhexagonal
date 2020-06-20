package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOCalculos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class DPOPagamentoDAEUnico extends DPOPagamento implements IDPOPagamento {

	private List<OTDValores> rateio;
	
	public DPOPagamentoDAEUnico() {
		super();
	}

	public DPOPagamentoDAEUnico(OTDDebitosFiscais debito, IDPOCalculos dpoCalculos, String nuDocumentoArrecadado,
			String nuParcela, Date dtVencimento, Date dtPagamento, BigDecimal vlPagamento) {
		super(debito, dpoCalculos, nuDocumentoArrecadado, nuParcela, dtVencimento, dtPagamento, vlPagamento);
	}
	
	public List<OTDValores> getRateio() {
		return rateio;
	}

	public void setRateio(List<OTDValores> rateio) {
		this.rateio = rateio;
	}

	@Override
	public void ratear() {
		List<OTDProcessoFiscal> listaDadosProcesso = debito.getDadosDAEUnico()
				.getListaDadosProcessos();
		
		List<OTDValores> saldos = new ArrayList<OTDValores>();
		
		for (OTDProcessoFiscal otdProcessoFiscal : listaDadosProcesso) {
			saldos.add(new OTDValores(otdProcessoFiscal.getSaldo()));
		}
		
		this.setRateio(this.dpoCalculos.ratearPorProcessos(saldos, this.getVlPagamento()));
	}

	@Override
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OTDValores calcularReducoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validar() {
		// TODO Auto-generated method stub
		
	}

}
