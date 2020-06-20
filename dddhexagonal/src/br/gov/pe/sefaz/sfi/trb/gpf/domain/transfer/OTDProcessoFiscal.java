package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.util.List;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcesso;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoInfracao;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoPrimario;
import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public class OTDProcessoFiscal {

	public VOProcesso processo;
	public VOProcessoPrimario processoPrimario;
	public VOProcessoSaldo saldo;
	public List<VOProcessoInfracao> infracoes;
	
	public OTDProcessoFiscal() {
		super();
	}

	public OTDProcessoFiscal(VOProcesso processo, VOProcessoPrimario processoPrimario, VOProcessoSaldo saldo,
			List<VOProcessoInfracao> infracoes) {
		super();
		this.processo = processo;
		this.processoPrimario = processoPrimario;
		this.saldo = saldo;
		this.infracoes = infracoes;
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

	public VOProcessoSaldo getSaldo() {
		return saldo;
	}

	public void setSaldo(VOProcessoSaldo saldo) {
		this.saldo = saldo;
	}

	public List<VOProcessoInfracao> getInfracoes() {
		return infracoes;
	}

	public void setInfracoes(List<VOProcessoInfracao> infracoes) {
		this.infracoes = infracoes;
	}
}
