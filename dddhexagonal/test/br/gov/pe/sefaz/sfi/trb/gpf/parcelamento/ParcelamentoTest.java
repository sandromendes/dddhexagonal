package br.gov.pe.sefaz.sfi.trb.gpf.parcelamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParcelamentoTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(ParcelamentoTest.class);
	
	@BeforeClass
    public static void setup(){
		LOG.info("@BeforeAll executed");
    }
     
    @AfterClass
    public static void after(){
    	LOG.info("@AfterClass executed");
    }
	
    @Test
    public void whenSomething_thenSomething() {
        assertTrue(true);
    }
 
    @Test
    public void whensomethingElse_thenSomethingElse() {
    	assertEquals(4, 2+2);
    }
}
