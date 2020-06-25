package br.gov.pe.sefaz.sfi.trb.gpf.service.rules;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;

public class RNFormalizarRegularizacaoDebitos {

	private static RNFormalizarRegularizacaoDebitos instancia;
    
    private RNFormalizarRegularizacaoDebitos(){}

    //Inicialização do tipo LAZY (preguiçosa)
    public static RNFormalizarRegularizacaoDebitos getInstance(){
        if(instancia == null){
            instancia = new RNFormalizarRegularizacaoDebitos();
        }
        return instancia;
    }
    
    public void executar(IDPOParcelamento payload){
    	
    }
}
