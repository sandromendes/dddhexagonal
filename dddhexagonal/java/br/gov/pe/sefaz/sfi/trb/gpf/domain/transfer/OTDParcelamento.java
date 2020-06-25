package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParmTpParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;

/**
 * @author Sandro
 *
 */
public class OTDParcelamento {
	
	public VOProcessoParcelamento parcelamento;
	public List<VOParcelamentoParcela> parcelas;
	public VOParmTpParcelamento parametrizacao;
	public List<OTDProcessoFiscal> listaDadosProcessos; 
	
	public OTDParcelamento() {
		super();
	}

	public OTDParcelamento(VOProcessoParcelamento parcelamento, List<VOParcelamentoParcela> parcelas,
			VOParmTpParcelamento parametrizacao, List<OTDProcessoFiscal> listaDadosProcessos) {
		super();
		this.parcelamento = parcelamento;
		this.parcelas = parcelas;
		this.parametrizacao = parametrizacao;
		this.listaDadosProcessos = listaDadosProcessos;
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

	public VOParmTpParcelamento getParametrizacao() {
		return parametrizacao;
	}

	public void setParametrizacao(VOParmTpParcelamento parametrizacao) {
		this.parametrizacao = parametrizacao;
	}

	public List<OTDProcessoFiscal> getListaDadosProcessos() {
		return listaDadosProcessos;
	}

	public void setListaDadosProcessos(List<OTDProcessoFiscal> listaDadosProcessos) {
		this.listaDadosProcessos = listaDadosProcessos;
	}
}
