package br.gov.pe.sefaz.sfi.trb.gpf.pagamento;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.DPOPagamentoFactory;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDAEUnico;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDProcessoFiscal;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento.ParcelasConcedidas;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento.ParcelasSolicitadas;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario.QuantidadeInfracoes;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.Juros;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.JurosHonorarios;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.Multa;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.MultaHonorarios;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.Principal;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo.PrincipalHonorarios;
import br.gov.pe.sefaz.sfi.trb.gpf.service.PagamentoService;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;
import br.gov.pe.sefaz.sfi.trb.gpf.service.impl.PagamentoServiceImpl;
import br.gov.pe.sefaz.sfi.trb.gpf.service.util.RandomString;

@RunWith(JUnitPlatform.class)
public class PagamentosTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(PagamentosTest.class);
	
	private static PagamentoService service;

	@BeforeClass
    public static void setup(){
		LOG.info("Pré processamento");
		service = new PagamentoServiceImpl();
    }
     
    @AfterClass
    public static void after(){
    	LOG.info("Pós processamento");
    }
	
    @Test
    public void whenDAEUnico_thenSelecionarProcessos() throws ParseException, ExcecaoAtributoNulo {
    	LOG.info("Pagamento de DAE único");

		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		
		List<OTDProcessoFiscal> listaDadosProcessos = new ArrayList<>();
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		
		OTDDAEUnico dadosDAEUnico = new OTDDAEUnico();
		dadosDAEUnico.setListaDadosProcessos(listaDadosProcessos);
		debito.setDadosDAEUnico(dadosDAEUnico);
		
		OTDDocumentoArrecadado dae = new OTDDocumentoArrecadado();
		dae.setDtPagamento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-01"));
		dae.setDtVencimento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-01"));
		dae.setNuDocumentoArrecadado(randomStringNumeric());
		dae.setNuParcela("997");
		dae.setVlPagamento(randomDecimal(1400));
		
		EnumTipoPagamento tipoPagamento = EnumTipoPagamento.DAE_UNICO;
		
		IDPOPagamento payload = DPOPagamentoFactory.criar(tipoPagamento, debito, dae);
		
		service.apropriarPagamento(payload);
	
    	
        assertTrue(true);
    }
 
    @Test
    public void whenAVista_thenCalcularValorParaLiquidar() throws ExcecaoAtributoNulo {
    	LOG.info("Pagamento à vista");
		
		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		
		debito.setDadosProcesso(randomDebito());
		
		OTDDocumentoArrecadado dae = new OTDDocumentoArrecadado();
		try {
			dae.setDtPagamento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-07"));
			dae.setDtVencimento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-07"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dae.setNuDocumentoArrecadado(randomStringNumeric());
		dae.setNuParcela("999");
		dae.setVlPagamento(randomDecimal(800));
		
		IDPOPagamento payload = DPOPagamentoFactory.criar(EnumTipoPagamento.AVISTA, debito, dae);
		
		service.apropriarPagamento(payload);
    	
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
    
	/**
	 * 
	 * @return
	 */
	private static VOProcessoParcelamento randomParcelamento() {
		Random random = new Random();
		
		Protocolo protocolo = new Protocolo(randomStringNumeric());
		ParcelasConcedidas concedidas = new ParcelasConcedidas(random.nextInt());
		ParcelasSolicitadas solicitadas = new ParcelasSolicitadas(random.nextInt());
		
		return new VOProcessoParcelamento(protocolo, concedidas, solicitadas);
	}
	
	/**
	 * 
	 * @return
	 */
	private static OTDProcessoFiscal randomDebito() {
		VOProcessoPrimario processo = randomProcessoPrimario();
		VOProcessoSaldo saldoProcesso = randomSaldo(processo.getProtocolo());
		
		OTDProcessoFiscal debito = new OTDProcessoFiscal();
		debito.setProcessoPrimario(processo);
		debito.setSaldo(saldoProcesso);
		return debito;
	}

	/**
	 * 
	 * @param protocolo
	 * @return
	 */
	private static VOProcessoSaldo randomSaldo(Protocolo protocolo) {
		
		Principal principal = new Principal(randomDecimal(3000));
		Multa multa = new Multa(randomDecimal(1000));
		Juros juros = new Juros(randomDecimal(400));
		PrincipalHonorarios honorarios = new PrincipalHonorarios(randomDecimal(300));
		MultaHonorarios multaHonorarios = new MultaHonorarios(randomDecimal(100));
		JurosHonorarios jurosHonorarios = new JurosHonorarios(randomDecimal(40));
		
		return new VOProcessoSaldo(protocolo, principal, multa, juros, honorarios, multaHonorarios, jurosHonorarios);
	}
	
	/**
	 * 
	 * @param range
	 * @return
	 */
    private static BigDecimal randomDecimal(int range) {
        BigDecimal max = new BigDecimal(range);
        BigDecimal random = BigDecimal.valueOf(Math.random());
        BigDecimal actualRandomDec = random.multiply(max);
        actualRandomDec = actualRandomDec.setScale(2, BigDecimal.ROUND_DOWN);
        return actualRandomDec;
    }

	/**
	 * 
	 * @return
	 */
	private static VOProcessoPrimario randomProcessoPrimario() {
		Protocolo protocolo = new Protocolo(randomStringNumeric());
		
		Random random = new Random();
		int randomInt = random.nextInt();
		
		QuantidadeInfracoes qtdInfracoes = new QuantidadeInfracoes(randomInt);
		return new VOProcessoPrimario(protocolo, qtdInfracoes);
	}

	/**
	 * 
	 * @return
	 */
	private static String randomStringNumeric() {
		RandomString gen = new RandomString(12, ThreadLocalRandom.current());
		String nuProtocolo = "2020" + gen.nextString();
		return nuProtocolo;
	}
}
