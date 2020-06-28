package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOImplantacao;

public class RNImplantarProcesso {

	private static RNImplantarProcesso instancia;
    
    private RNImplantarProcesso(){}

    //Inicializa��o do tipo LAZY (pregui�osa)
    public static RNImplantarProcesso getInstance(){
        if(instancia == null){
            instancia = new RNImplantarProcesso();
        }
        return instancia;
    }
    
    public void executar(IDPOImplantacao payload){
    	
    }
}