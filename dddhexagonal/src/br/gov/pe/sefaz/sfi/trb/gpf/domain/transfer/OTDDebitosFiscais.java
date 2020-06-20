package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

public class OTDDebitosFiscais {

	private OTDProcessoFiscal dadosProcesso;
	private OTDParcelamento dadosParcelamento;
	private OTDDefesa dadosDefesa;
	
	public OTDDebitosFiscais() {
		super();
	}

	public OTDProcessoFiscal getDadosProcesso() {
		return dadosProcesso;
	}

	public void setDadosProcesso(OTDProcessoFiscal dadosProcesso) {
		this.dadosProcesso = dadosProcesso;
	}

	public OTDParcelamento getDadosParcelamento() {
		return dadosParcelamento;
	}

	public void setDadosParcelamento(OTDParcelamento dadosParcelamento) {
		this.dadosParcelamento = dadosParcelamento;
	}

	public OTDDefesa getDadosDefesa() {
		return dadosDefesa;
	}

	public void setDadosDefesa(OTDDefesa dadosDefesa) {
		this.dadosDefesa = dadosDefesa;
	}
}
