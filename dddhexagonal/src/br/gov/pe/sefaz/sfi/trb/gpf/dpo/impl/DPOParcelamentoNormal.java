package br.gov.pe.sefaz.sfi.trb.gpf.dpo.impl;

import java.math.BigDecimal;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParmTpParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValores;

public class DPOParcelamentoNormal extends OTDDebitosFiscais implements IDPOParcelamento {

	@Override
	public OTDValores calcularReducoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal calcularVlParcelaInicial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VOProcessoPrimario> consultarProcessosFiscais() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOProcessoParcelamento consultarParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VOParcelamentoParcela> consultarParcelasEmitidas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VOParcelamentoParcela> consultarParcelasPagas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultarNuParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOParmTpParcelamento consultarParametrizacaoParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

}
