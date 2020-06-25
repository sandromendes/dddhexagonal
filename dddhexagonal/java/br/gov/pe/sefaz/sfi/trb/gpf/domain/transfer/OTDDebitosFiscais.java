package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

public class OTDDebitosFiscais {

	private OTDProcessoFiscal dadosProcesso;
	private OTDParcelamento dadosParcelamento;
	private OTDDefesa dadosDefesa;
	private OTDDAEUnico dadosDAEUnico;
	
	public OTDDebitosFiscais() {
		super();
	}
	
	public OTDDebitosFiscais(OTDProcessoFiscal dadosProcesso) {
		super();
		this.dadosProcesso = dadosProcesso;
	}
	
	public OTDDebitosFiscais(OTDProcessoFiscal dadosProcesso, OTDParcelamento dadosParcelamento) {
		super();
		this.dadosProcesso = dadosProcesso;
		this.dadosParcelamento = dadosParcelamento;
	}

	public OTDDebitosFiscais(OTDProcessoFiscal dadosProcesso, OTDDefesa dadosDefesa) {
		super();
		this.dadosProcesso = dadosProcesso;
		this.dadosDefesa = dadosDefesa;
	}

	public OTDDebitosFiscais(OTDProcessoFiscal dadosProcesso, OTDParcelamento dadosParcelamento,
			OTDDefesa dadosDefesa) {
		super();
		this.dadosProcesso = dadosProcesso;
		this.dadosParcelamento = dadosParcelamento;
		this.dadosDefesa = dadosDefesa;
	}

	public OTDDebitosFiscais(OTDDAEUnico dadosDAEUnico) {
		super();
		this.dadosDAEUnico = dadosDAEUnico;
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

	public OTDDAEUnico getDadosDAEUnico() {
		return dadosDAEUnico;
	}

	public void setDadosDAEUnico(OTDDAEUnico dadosDAEUnico) {
		this.dadosDAEUnico = dadosDAEUnico;
	}
}
