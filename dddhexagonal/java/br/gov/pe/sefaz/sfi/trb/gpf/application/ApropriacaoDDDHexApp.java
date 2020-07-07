package br.gov.pe.sefaz.sfi.trb.gpf.application;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.DPOPagamentoFactory;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDAEUnico;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDocumentoArrecadado;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDParcelamento;
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

public class ApropriacaoDDDHexApp {
	
	private static final Logger LOG = LoggerFactory.getLogger(ApropriacaoDDDHexApp.class);
	private static PagamentoService service = new PagamentoServiceImpl();
	
	public static void main(String[] args) {

		try {
			testarDAEAVista();

			testarDAEUnico();
			
			testarDAEParcela();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @throws ExcecaoAtributoNulo
	 * @throws ParseException 
	 */
	private static void testarDAEUnico() throws ExcecaoAtributoNulo, ParseException {
		LOG.info("Iniciando testes de apropriação de DAE Único");
		
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
	}

	/**
	 * 
	 * @throws ExcecaoAtributoNulo
	 * @throws ParseException
	 */
	private static void testarDAEParcela() throws ExcecaoAtributoNulo, ParseException {
		LOG.info("Iniciando testes de apropriação de parcela");
		
		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		
		List<OTDProcessoFiscal> listaDadosProcessos = new ArrayList<>();
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		listaDadosProcessos.add(randomDebito());
		
		VOProcessoParcelamento parcelamento = randomParcelamento();
		
		OTDParcelamento dadosParcelamento = new OTDParcelamento();
		dadosParcelamento.setListaDadosProcessos(listaDadosProcessos);
		dadosParcelamento.setParcelamento(parcelamento);
		
		debito.setDadosParcelamento(dadosParcelamento);
		
		OTDDocumentoArrecadado dae = new OTDDocumentoArrecadado();
		dae.setDtPagamento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-01"));
		dae.setDtVencimento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-01"));
		dae.setNuDocumentoArrecadado(randomStringNumeric());
		dae.setNuParcela("1");
		dae.setVlPagamento(randomDecimal(1400));
		
		IDPOPagamento payload = DPOPagamentoFactory.criar(EnumTipoPagamento.PARCELA, debito, dae);
		
		service.apropriarPagamento(payload);
	}
	
	/**
	 * 
	 * @throws ExcecaoAtributoNulo
	 * @throws ParseException 
	 */
	private static void testarDAEAVista() throws ExcecaoAtributoNulo, ParseException {
		LOG.info("Iniciando testes de apropriação de DAE à vista");
		
		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		
		debito.setDadosProcesso(randomDebito());
		
		OTDDocumentoArrecadado dae = new OTDDocumentoArrecadado();
		dae.setDtPagamento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-07"));
		dae.setDtVencimento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-07"));
		dae.setNuDocumentoArrecadado(randomStringNumeric());
		dae.setNuParcela("999");
		dae.setVlPagamento(randomDecimal(800));
		
		IDPOPagamento payload = DPOPagamentoFactory.criar(EnumTipoPagamento.AVISTA, debito, dae);
		
		service.apropriarPagamento(payload);
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
    public static BigDecimal randomDecimal(int range) {
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
