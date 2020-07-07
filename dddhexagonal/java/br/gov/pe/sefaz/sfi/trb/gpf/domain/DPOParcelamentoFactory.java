package br.gov.pe.sefaz.sfi.trb.gpf.domain;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOParcelamentoEspecial;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOParcelamentoNormal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPORegularizacaoDebitos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;

public class DPOParcelamentoFactory {
	
	private DPOParcelamentoFactory() {
		throw new IllegalStateException("Classe utilitária");
	}
	
	public static IDPOParcelamento criar(EnumTipoParcelamento tipoParcelamento, OTDDebitosFiscais debito) 
			throws ExcecaoAtributoNulo {
		IDPOParcelamento payload;
		
		switch (tipoParcelamento) {
		case NORMAL:
			payload = new DPOParcelamentoNormal(debito);
			break;
		case REGULARIZACAO_DEBITOS:
			payload = new DPORegularizacaoDebitos(debito);
			break;
		case ESPECIAL:	
			payload = new DPOParcelamentoEspecial(debito);
			break;
		default :
			payload = new DPOParcelamentoNormal(debito);
		}
		
		payload.validar();
		
		return payload;
	}

}
