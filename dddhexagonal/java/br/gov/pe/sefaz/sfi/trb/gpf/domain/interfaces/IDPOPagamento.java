package br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads.DPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;

public interface IDPOPagamento {
	
	public void ratear();
	public DPOPagamento getDadosPagamento();
	public OTDValoresLiquidacaoPagamento calcularValorLiquidacao();
	public OTDValores calcularReducoes();
	public void validar() throws ExcecaoAtributoNulo;
}
