package br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParmTpParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.service.otd.OTDValores;

public interface IDPOParcelamento {
	public OTDValores calcularReducoes();
	public BigDecimal calcularVlParcelaInicial();
	public List<VOProcessoPrimario> consultarProcessosFiscais();
	public VOProcessoParcelamento consultarParcelamento();
	public Set<VOParcelamentoParcela> consultarParcelasEmitidas();
	public Set<VOParcelamentoParcela> consultarParcelasPagas();	
	public String consultarNuParcelamento();
	public VOParmTpParcelamento consultarParametrizacaoParcelamento();
}
