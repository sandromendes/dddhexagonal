package br.gov.pe.sefaz.sfi.trb.gpf.domain;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOParcelamentoEspecial;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOParcelamentoNormal;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPORegularizacaoDebitos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.service.ExcecaoAtributoNulo;

public class DPOParcelamentoFactory {
	
	public static IDPOParcelamento criar(EnumTipoParcelamento tipoParcelamento, OTDDebitosFiscais debito) 
			throws ExcecaoAtributoNulo {
		IDPOParcelamento payload;
		
		switch (tipoParcelamento) {
		case NORMAL:
			payload = new DPOParcelamentoNormal(debito);
		case REGULARIZACAO_DEBITOS:
			payload = new DPORegularizacaoDebitos(debito);
		case ESPECIAL:	
			payload = new DPOParcelamentoEspecial(debito);
		default :
			payload = new DPOParcelamentoNormal(debito);
		}
		
		payload.validar();
		
		return payload;
	}

}
