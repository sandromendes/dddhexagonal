package br.gov.pe.sefaz.sfi.trb.gpf.pagamento;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.service.PagamentoService;

public class PagamentosTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(PagamentosTest.class);

	@BeforeClass
    public static void setup(){
		LOG.info("@BeforeAll executed");
    }
     
    @AfterClass
    public static void after(){
    	LOG.info("@AfterClass executed");
    }
	
    @Test
    public void whenThis_thenThat() {
    	LOG.info("TODO");
        assertTrue(true);
    }
 
    @Test
    public void whenSomething_thenSomething() {
        assertTrue(true);
    }
 
    @Test
    public void whenSomethingElse_thenSomethingElse() {
        assertTrue(true);
    }
}
