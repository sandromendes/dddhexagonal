package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;

public class RNCancelarParcelamento {

	//Inicialização do tipo EAGER (apressada)
    private static final RNCancelarParcelamento instancia = new RNCancelarParcelamento();
    
    private RNCancelarParcelamento(){}

    public static RNCancelarParcelamento getInstance(){
        return instancia;
    }
	
    public void executar(IDPOParcelamento payload){
    	
    }
}
