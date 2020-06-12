package br.gov.pe.sefaz.sfi.trb.gpf.dpo;

import br.gov.pe.sefaz.sfi.trb.gpf.dpo.impl.DPOParcelamentoEspecial;
import br.gov.pe.sefaz.sfi.trb.gpf.dpo.impl.DPOParcelamentoNormal;
import br.gov.pe.sefaz.sfi.trb.gpf.dpo.impl.DPORegularizacaoDebitos;
import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.ExcecaoAtributoNulo;
import br.gov.pe.sefaz.sfi.trb.gpf.service.categories.EnumTipoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDDebitosFiscais;

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
