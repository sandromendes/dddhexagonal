package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOCalculos;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;

public class DPOCalculos implements IDPOCalculos {

	@Override
	public OTDValores ratearPorRubricas(OTDValores saldo, BigDecimal vlRateio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OTDValores> ratearPorProcessos(List<OTDValores> saldos, BigDecimal vlRateio) {
		
		for (OTDValores saldo : saldos) {
			//Calcular fator de ajuste
			BigDecimal fator = BigDecimal.ZERO;
			
			saldo = this.ratearPorRubricas(saldo, fator);
		}
		
		return saldos;
	}



}
