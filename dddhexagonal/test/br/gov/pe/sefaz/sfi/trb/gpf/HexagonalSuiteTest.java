package br.gov.pe.sefaz.sfi.trb.gpf;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import br.gov.pe.sefaz.sfi.trb.gpf.pagamento.PagamentosTest;
import br.gov.pe.sefaz.sfi.trb.gpf.parcelamento.ParcelamentoTest;
import br.gov.pe.sefaz.sfi.trb.gpf.parcelamento.RegularizacaoDebitoTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({
	PagamentosTest.class,
	ParcelamentoTest.class,
	RegularizacaoDebitoTest.class
})
public class HexagonalSuiteTest {

}
