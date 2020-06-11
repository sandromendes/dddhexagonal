package br.gov.pe.sefaz.sfi.trb.gpf.service.rules;

import br.gov.pe.sefaz.sfi.trb.gpf.dpo.interfaces.IDPOParcelamento;

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
