package model.entidade;

import model.exceptions.ExcecaoDeDominio;

public class ContaCorrente {

	private Integer numConta;
	private String titularConta;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaCorrente(Integer numConta, String titularConta, Double saldo, Double limiteSaque) {
		this.numConta = numConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(double valor) {
		if (valor > limiteSaque) {
			
			throw new ExcecaoDeDominio("O valor excede o limite de retirada!!!");
		}
		if (valor > saldo){
			throw new ExcecaoDeDominio("Saldo Insuficiente!!!");
		}
		saldo -= valor;
	}
	
	
}
