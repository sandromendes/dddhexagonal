package br.gov.pe.sefaz.sfi.trb.gpf.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.DPOParcelamentoFactory;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.categories.EnumTipoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.DataCiencia;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.NumeroDocumento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso.Protocolo;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento.ParcelasConcedidas;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento.ParcelasSolicitadas;
import br.gov.pe.sefaz.sfi.trb.gpf.service.ParcelamentoService;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;
import br.gov.pe.sefaz.sfi.trb.gpf.service.impl.ParcelamentoServiceImpl;

public class ParcelamentoDDDHexApp {
	
	private static final Logger LOG = LoggerFactory.getLogger(ParcelamentoDDDHexApp.class);
	private static ParcelamentoService service = new ParcelamentoServiceImpl();

	public static void main(String[] args) {
		
		OTDDebitosFiscais debito = new OTDDebitosFiscais();
		
		try {
			//Teste de formalização de parcelamento normal
			IDPOParcelamento payloadNormal = formalizarParcelamentoNormal(debito);
			service.formalizarParcelamento(payloadNormal);
			
			//Teste de formalização de parcelamento especial
			IDPOParcelamento payloadEspecial = formalizarParcelamentoEspecial();
			service.formalizarParcelamento(payloadEspecial);
			
			//Teste de formalização de de regularizacao de debitos
			IDPOParcelamento payloadRD = formalizarRegularizacaoDebitos();
			service.formalizarRegularizacaoDebitos(payloadRD);
		} catch (ExcecaoAtributoNulo | ParseException e) {
			LOG.info(e.getMessage());
		}
	}

	/**
	 * 
	 * @param debito
	 * @return
	 * @throws ParseException
	 * @throws ExcecaoAtributoNulo
	 */
	private static IDPOParcelamento formalizarParcelamentoNormal(OTDDebitosFiscais debito)
			throws ParseException, ExcecaoAtributoNulo {
		
		VOProcesso processo = new VOProcesso(new Protocolo("202000000000018"), 
				new DataCiencia(new SimpleDateFormat("yyyy-MM-dd").parse("2020-06-01")), 
				new NumeroDocumento( "00000191"));
		debito.getDadosProcesso().setProcesso(processo);
		
		VOProcessoParcelamento processoParcelamento = new VOProcessoParcelamento( 
				new Protocolo("202000000000019"), 
				new ParcelasConcedidas(10), 
				new ParcelasSolicitadas(10));
		debito.getDadosParcelamento().setParcelamento(processoParcelamento);
		
		return DPOParcelamentoFactory.criar(EnumTipoParcelamento.NORMAL, debito);
	}

	/**
	 * 
	 * @return
	 * @throws ExcecaoAtributoNulo
	 */
	private static IDPOParcelamento formalizarParcelamentoEspecial() throws ExcecaoAtributoNulo {
		OTDDebitosFiscais debito;
		debito = new OTDDebitosFiscais();			
		
		return DPOParcelamentoFactory.criar(EnumTipoParcelamento.ESPECIAL, debito);
	}

	/**
	 * 
	 * @return
	 * @throws ExcecaoAtributoNulo
	 */
	private static IDPOParcelamento formalizarRegularizacaoDebitos() throws ExcecaoAtributoNulo {
		OTDDebitosFiscais debito;
		debito = new OTDDebitosFiscais();
		
		return DPOParcelamentoFactory.criar(EnumTipoParcelamento.REGULARIZACAO_DEBITOS, debito);
	}
}
