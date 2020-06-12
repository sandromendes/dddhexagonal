package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParcelamentoParcela;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOParmTpParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoInfracao;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoParcelamento;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public class OTDDebitosFiscais {
	
	public VOProcesso processo;
	public VOProcessoPrimario processoPrimario;
	public VOProcessoParcelamento parcelamento;
	public List<VOProcessoInfracao> infracoes;
	public VOProcessoSaldo saldo;
	public List<VOParcelamentoParcela> parcelas;
	public VOParmTpParcelamento parametrizacao;
	
	public OTDDebitosFiscais() {
		super();
	}

	public OTDDebitosFiscais(VOProcesso processo, VOProcessoPrimario processoPrimario,
			VOProcessoParcelamento parcelamento, List<VOProcessoInfracao> infracoes, VOProcessoSaldo saldo,
			List<VOParcelamentoParcela> parcelas, VOParmTpParcelamento parametrizacao) {
		super();
		this.processo = processo;
		this.processoPrimario = processoPrimario;
		this.parcelamento = parcelamento;
		this.infracoes = infracoes;
		this.saldo = saldo;
		this.parcelas = parcelas;
		this.parametrizacao = parametrizacao;
	}

	public VOProcesso getProcesso() {
		return processo;
	}

	public void setProcesso(VOProcesso processo) {
		this.processo = processo;
	}

	public VOProcessoPrimario getProcessoPrimario() {
		return processoPrimario;
	}

	public void setProcessoPrimario(VOProcessoPrimario processoPrimario) {
		this.processoPrimario = processoPrimario;
	}

	public VOProcessoParcelamento getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(VOProcessoParcelamento parcelamento) {
		this.parcelamento = parcelamento;
	}

	public List<VOProcessoInfracao> getInfracoes() {
		return infracoes;
	}

	public void setInfracoes(List<VOProcessoInfracao> infracoes) {
		this.infracoes = infracoes;
	}

	public VOProcessoSaldo getSaldo() {
		return saldo;
	}

	public void setSaldo(VOProcessoSaldo saldo) {
		this.saldo = saldo;
	}

	public List<VOParcelamentoParcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<VOParcelamentoParcela> parcelas) {
		this.parcelas = parcelas;
	}

	public VOParmTpParcelamento getParametrizacao() {
		return parametrizacao;
	}

	public void setParametrizacao(VOParmTpParcelamento parametrizacao) {
		this.parametrizacao = parametrizacao;
	}
	
}
