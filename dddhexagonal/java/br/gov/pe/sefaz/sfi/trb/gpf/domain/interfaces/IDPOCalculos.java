package br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces;

import java.math.BigDecimal;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;

public interface IDPOCalculos {
	
	public OTDValores ratearPorRubricas(OTDValores saldo, BigDecimal vlRateio);
	
	public List<OTDValores> ratearPorProcessos(List<OTDValores> saldos, BigDecimal vlRateio);

}
