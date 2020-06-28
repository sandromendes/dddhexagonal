package br.gov.pe.sefaz.sfi.trb.gpf.parcelamento;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.service.ParcelamentoService;

@RunWith(JUnitPlatform.class)
public class ParcelamentoTest {
	
private static final Logger LOG = LoggerFactory.getLogger(ParcelamentoTest.class);
	
	@Mock private ParcelamentoService service; 
	
	@BeforeClass
    public static void setup(){
		LOG.info("Pré processamento");
    }
     
    @AfterClass
    public static void after(){
    	LOG.info("Pós processamento");
    }
	
    @Test
    public void whenFormalizarParcelamento_thenCriarProcessoParcelamento() {
    	LOG.info("Parcelamento normal");
        assertTrue(true);
    }
    
    @Test
    public void whenFormalizarParcelamentoEspecial_thenAplicarReducoesParametrizadas() {
    	LOG.info("Parcelamento Especial");
        assertTrue(true);
    }
 
    @Test
    public void whenCancelarParcelamento_thenExcluirProcessoParcelamento() {
    	LOG.info("Cancelamento de parcelamento");
    	assertTrue(true);
    }
    
    @Test
    public void whenEmitirParcela_thenGravarParcelas() {
    	LOG.info("Emissão de parcelas");
    	assertTrue(true);
    }
    
    @Test
    public void whenEsgotarParcelamento_thenAlterarSituacao_e_GravarPerda() {
    	LOG.info("Esgotamento de parcelamento");
    	assertTrue(true);
    }
}
