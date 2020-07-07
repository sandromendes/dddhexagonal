package br.gov.pe.sefaz.sfi.trb.gpf.domain.transfer;

import java.math.BigDecimal;

import br.gov.pe.sefaz.sfi.trb.gpf.infrastructure.model.VOProcessoSaldo;

public class OTDValoresLiquidacaoPagamento {
	
	private OTDValores saldo;
	private OTDValores reducoes;
	
	public OTDValoresLiquidacaoPagamento() {
		super();
		this.saldo = new OTDValores();
		this.reducoes = new OTDValores();
		
		this.saldo.setVlPrincipal(BigDecimal.ZERO);
		this.saldo.setVlMulta(BigDecimal.ZERO);
		this.saldo.setVlJuros(BigDecimal.ZERO);
		this.saldo.setVlHonorarios(BigDecimal.ZERO);
		this.saldo.setVlMultaHonorarios(BigDecimal.ZERO);
		this.saldo.setVlJurosHonorarios(BigDecimal.ZERO);
		this.reducoes.setVlPrincipal(BigDecimal.ZERO);
		this.reducoes.setVlMulta(BigDecimal.ZERO);
		this.reducoes.setVlJuros(BigDecimal.ZERO);
		this.reducoes.setVlHonorarios(BigDecimal.ZERO);
		this.reducoes.setVlMultaHonorarios(BigDecimal.ZERO);
		this.reducoes.setVlJurosHonorarios(BigDecimal.ZERO);
	}

	public OTDValoresLiquidacaoPagamento(VOProcessoSaldo saldo) {
		super();
		this.saldo = new OTDValores();
		this.reducoes = new OTDValores();
		
		this.saldo.setVlPrincipal(saldo.getPrincipal().value());
		this.saldo.setVlMulta(saldo.getMulta().value());
		this.saldo.setVlJuros(saldo.getJuros().value());
		this.saldo.setVlHonorarios(saldo.getPrincipalHonorarios().value());
		this.saldo.setVlMultaHonorarios(saldo.getMultaHonorarios().value());
		this.saldo.setVlJurosHonorarios(saldo.getJurosHonorarios().value());
		this.reducoes.setVlPrincipal(BigDecimal.ZERO);
		this.reducoes.setVlMulta(BigDecimal.ZERO);
		this.reducoes.setVlJuros(BigDecimal.ZERO);
		this.reducoes.setVlHonorarios(BigDecimal.ZERO);
		this.reducoes.setVlMultaHonorarios(BigDecimal.ZERO);
		this.reducoes.setVlJurosHonorarios(BigDecimal.ZERO);
	}
	
	public void add(OTDValoresLiquidacaoPagamento liquidacao) {
		this.saldo.setVlPrincipal(this.saldo.getVlPrincipal().add(liquidacao.saldo.getVlPrincipal()));
		this.saldo.setVlMulta(this.saldo.getVlMulta().add(liquidacao.saldo.getVlMulta()));
		this.saldo.setVlJuros(this.saldo.getVlJuros().add(liquidacao.saldo.getVlJuros()));
		this.saldo.setVlHonorarios(this.saldo.getVlHonorarios().add(liquidacao.saldo.getVlHonorarios()));
		this.saldo.setVlMultaHonorarios(this.saldo.getVlMultaHonorarios().add(liquidacao.saldo.getVlMultaHonorarios()));
		this.saldo.setVlJurosHonorarios(this.saldo.getVlJurosHonorarios().add(liquidacao.saldo.getVlJurosHonorarios()));
		this.reducoes.setVlPrincipal(this.reducoes.getVlPrincipal().add(liquidacao.reducoes.getVlPrincipal()));
		this.reducoes.setVlMulta(this.reducoes.getVlMulta().add(liquidacao.reducoes.getVlMulta()));
		this.reducoes.setVlJuros(this.reducoes.getVlJuros().add(liquidacao.reducoes.getVlJuros()));
		this.reducoes.setVlHonorarios(this.reducoes.getVlHonorarios().add(liquidacao.reducoes.getVlHonorarios()));
		this.reducoes.setVlMultaHonorarios(this.reducoes.getVlMultaHonorarios().add(liquidacao.reducoes.getVlMultaHonorarios()));
		this.reducoes.setVlJurosHonorarios(this.reducoes.getVlJurosHonorarios().add(liquidacao.reducoes.getVlJurosHonorarios()));
	}

	public void setReducoes(OTDValores reducoes) {
		this.reducoes = reducoes;
	}

	public BigDecimal getValorLiquidacao() {
		return this.saldo.getVlPrincipal()
				.add(this.saldo.getVlMulta())
				.add(this.saldo.getVlJuros())
				.add(this.saldo.getVlHonorarios())
				.add(this.saldo.getVlJurosHonorarios())
				.add(this.saldo.getVlMultaHonorarios())
				.subtract(this.reducoes.getVlPrincipal())
				.subtract(this.reducoes.getVlMulta())
				.subtract(this.reducoes.getVlJuros())
				.subtract(this.reducoes.getVlHonorarios())
				.subtract(this.reducoes.getVlHonorarios())
				.subtract(this.reducoes.getVlJurosHonorarios());
	}
}
