package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import java.math.BigDecimal;
import java.util.Date;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOPagamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValoresLiquidacaoPagamento;

public class RNApropriarPagamento {

	// Inicialização do tipo EAGER (apressada)
	private static final RNApropriarPagamento instancia = new RNApropriarPagamento();

	private RNApropriarPagamento() {
	}

	public static RNApropriarPagamento getInstance() {
		return instancia;
	}

	/**
	 * Algoritmo: 
	 * 1 - Recuperar os dados do pagamento, valor, data de pagamento, número de parcela
	 * 2 - Identificar o tipo do pagamento, à vista, único, parcela
	 * 3 - Calcular o valor pra liquidação do débito
	 * 4 - Verificar se o valor pago é suficiente pra ratear
	 * 5 - Realizar o rateio correspondente ao tipo de pagamento(rateio por processo e rateio por rubrica)
	 * 6 - Alterar os dados do processo, se necessário
	 * 
	 * @param payload
	 */
	public void executar(IDPOPagamento payload) {

		BigDecimal vlPagamento = payload.getDadosPagamento().getDae().getVlPagamento();
		Date dtPagamento = payload.getDadosPagamento().getDae().getDtPagamento();
		
		OTDValoresLiquidacaoPagamento dadosLiquidacao = payload.calcularValorLiquidacao();
		
		if(vlPagamento.compareTo(dadosLiquidacao.getValorLiquidacao()) >= 0) {
			//realizar o rateio proporcional
			payload.ratear();			
		} else {
			//realizar o rateio simples
			payload.ratear();
		}
	}
}
