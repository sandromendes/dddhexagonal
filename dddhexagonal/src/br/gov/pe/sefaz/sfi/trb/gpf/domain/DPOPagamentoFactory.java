package br.gov.pe.sefaz.sfi.trb.gpf.domain;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoAVista;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoAVistaEspecial;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;

public class DPOPagamentoFactory {
	
	public static IDPOPagamento criar(EnumTipoPagamento tipoPagamento, OTDDebitosFiscais debito) 
			throws ExcecaoAtributoNulo {
		IDPOPagamento payload;
		
		switch (tipoPagamento) {
		case AVISTA:
			payload = new DPOPagamentoAVista(debito);
		case AVISTA_ESPECIAL:
			payload = new DPOPagamentoAVistaEspecial(debito);
		case PARCELA:	
			payload = new DPOPagamentoParcela(debito);
		case AVULSO:
		
		case DACAO:
			
		case ADJUDICACAO:
			
		case EXECUCAO_FISCAL:	
		default :
			payload = new DPOPagamentoAVista(debito);
		}
		
		payload.validar();
		
		return payload;
	}
}
