package br.gov.pe.sefaz.sfi.trb.gpf.pagamento;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.service.PagamentoService;

@RunWith(JUnitPlatform.class)
public class PagamentosTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(PagamentosTest.class);
	
	@Mock private PagamentoService service;

	@BeforeClass
    public static void setup(){
		LOG.info("Pré processamento");
    }
     
    @AfterClass
    public static void after(){
    	LOG.info("Pós processamento");
    }
	
    @Test
    public void whenDAEUnico_thenSelecionarProcessos() {
    	LOG.info("Pagamento de DAE único");
        assertTrue(true);
    }
 
    @Test
    public void whenAVista_thenCalcularValorParaLiquidar() {
    	LOG.info("Pagamento à vista");
        assertTrue(true);
    }
 
    @Test
    public void whenParcelaInicial_thenCalcularReducoesERatear() {
    	LOG.info("Processando parcela inicial");
        assertTrue(true);
    }
    
    @Test
    public void whenDemaisParcelas_thenRatearPorProcessos() {
    	LOG.info("Realizando o rateio de parcela");
        assertTrue(true);
    }
}
