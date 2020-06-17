package br.gov.pe.sefaz.sfi.trb.gpf.domain.payloads;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import br.gov.pe.sefaz.sfi.trb.gpf.domain.interfaces.IDPOParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDDebitosFiscais;
import br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer.OTDValores;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParmTpParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.service.error.ExcecaoAtributoNulo;

public class DPOParcelamentoNormal implements IDPOParcelamento {
	
	private OTDDebitosFiscais debito;
	
	public DPOParcelamentoNormal(OTDDebitosFiscais debito) {
		super();
		this.debito = debito;
	}

	@Override
	public OTDValores calcularReducoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal calcularVlParcelaInicial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VOProcessoPrimario> consultarProcessosFiscais() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOProcessoParcelamento consultarParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<VOParcelamentoParcela> consultarParcelasEmitidas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<VOParcelamentoParcela> consultarParcelasPagas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultarNuParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOParmTpParcelamento consultarParametrizacaoParcelamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validar() throws ExcecaoAtributoNulo{
		if(this.debito.getProcesso() == null ) {
			throw new ExcecaoAtributoNulo("O atributo Processo é obrigatório");
		}
		
		if(this.debito.getParcelamento() == null) {
			throw new ExcecaoAtributoNulo("O atributo Parcelamento é obrigatório");
		}
		
		if(this.debito.getProcessoPrimario() == null) {
			throw new ExcecaoAtributoNulo("O atributo Processo Primário é obrigatório");
		}
	}

}
