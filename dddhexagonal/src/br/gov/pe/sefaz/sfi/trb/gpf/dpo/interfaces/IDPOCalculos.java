package br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces;

import java.math.BigDecimal;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValores;

public interface IDPOCalculos {
	
	public OTDValores ratearPorRubricas(OTDValores saldo, BigDecimal vlRateio);
	
	public List<OTDValores> ratearPorProcessos(List<OTDValores> saldos, BigDecimal vlRateio);

}
