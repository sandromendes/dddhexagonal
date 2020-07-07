package br.gov.pe.sefaz.sfi.trb.gpf.domain;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoAVista;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoAVistaEspecial;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoAVulso;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoDAEUnico;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;

public class DPOPagamentoFactory {
	
	private DPOPagamentoFactory() {
		throw new IllegalStateException("Classe utilitária");
	}
	
	public static IDPOPagamento criar(EnumTipoPagamento tipoPagamento, OTDDebitosFiscais debito, OTDDocumentoArrecadado dae) 
			throws ExcecaoAtributoNulo {
		IDPOPagamento payload;
		
		switch (tipoPagamento) {
		case AVISTA:
			payload = new DPOPagamentoAVista(debito, dae);
			break;
		case AVISTA_ESPECIAL:
			payload = new DPOPagamentoAVistaEspecial(debito, dae);
			break;
		case PARCELA:	
			payload = new DPOPagamentoParcela(debito, dae);
			break;
		case AVULSO:
			payload = new DPOPagamentoAVulso(debito, dae);
			break;
		case DAE_UNICO:
			payload = new DPOPagamentoDAEUnico(debito, dae);
			break;
		default :
			payload = new DPOPagamentoAVista(debito, dae);
		}
		
		payload.validar();
		
		return payload;
	}
}
