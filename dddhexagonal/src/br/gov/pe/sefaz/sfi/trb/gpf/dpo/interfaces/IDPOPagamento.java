package br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces;

import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValoresLiquidacaoPagamento;

public interface IDPOPagamento {
	
	public void ratear();
	public OTDValoresLiquidacaoPagamento calcularValoreLiquidacao();
	public OTDValores calcularReducoes();
}
