package com.dio.projeto;

public class Cliente {
	private String nome;
	private String sobrenome;
	private Conta conta;
	private String chavePIX="";
	
	public Cliente(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void setchavePIX(String chave) {
		this.chavePIX = chave;
	}



	public String getNome() {
		return nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public Conta getConta() {
		return conta;
	}



	public String getChavePIX() {
		return chavePIX;
	}



	@Override
	public String toString() {
		return "Informações do Cliente: \nNome=" + nome + "\nSobrenome=" + sobrenome + "\nConta=" + conta;
	}
	
	
}
