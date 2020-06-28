package br.gov.pe.sefaz.sfi.trb.gpf.service.business;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;

public class RNEmitirParcelas {

    private static RNEmitirParcelas instancia;
    
    private RNEmitirParcelas(){}
    
    //Inicialização por bloco estático
    static{
        try{
            instancia = new RNEmitirParcelas();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static RNEmitirParcelas getInstance(){
        return instancia;
    }
    
    public void executar(IDPOParcelamento payload){
    	
    }
}
