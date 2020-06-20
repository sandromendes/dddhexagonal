package br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public interface IDPOPagamento {
	
	public void ratear();
	public OTDValoresLiquidacaoPagamento calcularValoreLiquidacao();
	public OTDValores calcularReducoes();
	public void validar();
}
