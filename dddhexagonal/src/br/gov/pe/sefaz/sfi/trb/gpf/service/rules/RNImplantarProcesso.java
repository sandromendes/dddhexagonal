package br.gov.pe.sefaz.sfi.trb.gpf.service.rules;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;

public class RNImplantarProcesso {

	private static RNImplantarProcesso instancia;
    
    private RNImplantarProcesso(){}

    //Inicialização do tipo LAZY (preguiçosa)
    public static RNImplantarProcesso getInstance(){
        if(instancia == null){
            instancia = new RNImplantarProcesso();
        }
        return instancia;
    }
    
    public void executar(IDPOParcelamento payload){
    	
    }
}
