package br.gov.pe.sefaz.sfi.trb.gpf.application;

import br.gov.pe.sefaz.sfi.trb.gpf.dpo.DPOParcelamentoFactory;
import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.categories.EnumTipoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.service.rules.RNFormalizarParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.rules.RNFormalizarRegularizacaoDebitos;

public class ParcelamentoDDDHexApp {

	public static void main(String[] args) {
		
		//Teste de formalização de parcelamento normal
		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		IDPOParcelamento payloadNormal = DPOParcelamentoFactory.criar(EnumTipoParcelamento.NORMAL, debito);

		RNFormalizarParcelamento.getInstance().executar(payloadNormal);
		
		//Teste de formalização de parcelamento especial
		IDPOParcelamento payloadEspecial = DPOParcelamentoFactory.criar(EnumTipoParcelamento.ESPECIAL, debito);
		
		RNFormalizarParcelamento.getInstance().executar(payloadEspecial);
		
		//Teste de formalização de de regularizacao de debitos
		IDPOParcelamento payloadRD = DPOParcelamentoFactory.criar(EnumTipoParcelamento.REGULARIZACAO_DEBITOS, debito);
		
		RNFormalizarRegularizacaoDebitos.getInstance().executar(payloadRD);
	}

}
