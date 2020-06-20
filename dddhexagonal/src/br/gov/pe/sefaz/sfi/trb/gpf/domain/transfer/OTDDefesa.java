package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VODefesaInfracao;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VODefesaSaldo;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoDefesa;

public class OTDDefesa {
	
	private VOProcessoDefesa defesa;
	private List<VODefesaInfracao> listaDefesaInfracao;
	private VODefesaSaldo defesaSaldo;
	
	public OTDDefesa() {
		super();
	}

	public OTDDefesa(VOProcessoDefesa defesa, List<VODefesaInfracao> listaDefesaInfracao, VODefesaSaldo defesaSaldo) {
		super();
		this.defesa = defesa;
		this.listaDefesaInfracao = listaDefesaInfracao;
		this.defesaSaldo = defesaSaldo;
	}

	public VOProcessoDefesa getDefesa() {
		return defesa;
	}

	public void setDefesa(VOProcessoDefesa defesa) {
		this.defesa = defesa;
	}

	public List<VODefesaInfracao> getListaDefesaInfracao() {
		return listaDefesaInfracao;
	}

	public void setListaDefesaInfracao(List<VODefesaInfracao> listaDefesaInfracao) {
		this.listaDefesaInfracao = listaDefesaInfracao;
	}

	public VODefesaSaldo getDefesaSaldo() {
		return defesaSaldo;
	}

	public void setDefesaSaldo(VODefesaSaldo defesaSaldo) {
		this.defesaSaldo = defesaSaldo;
	}
}
