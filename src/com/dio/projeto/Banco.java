package com.dio.projeto;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	public String nome;
	private int agencias[];
	private List<Conta> contas = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	public Banco(String nome, int[] agencias) {
		this.nome = nome;
		this.agencias = agencias;
	}
	
	//Adiciona um novo cliente ao banco
	public Cliente novoCliente(String nome, String sobrenome) {
		Cliente novoCliente = new Cliente(nome, sobrenome);
		clientes.add(novoCliente);
		return novoCliente;
	}
	
	//Cria uma nova conta corrente e a vincula a um cliente
	public void novaContaCorrente(Cliente cliente, int agencia, int depositoInicial) {
		Conta novaConta = new ContaCorrente(cliente, agencia, depositoInicial);
		contas.add(novaConta);
		cliente.setConta(novaConta);
	}
	
	//Cria uma nova conta poupança e a vincula a um cliente
	public void novaContaPoupanca(Cliente cliente, int agencia, int depositoInicial) {
		Conta novaConta = new ContaPoupanca(cliente, agencia, depositoInicial);
		contas.add(novaConta);
		cliente.setConta(novaConta);
	}
	
	//Transfere para uma conta informando a agencia e conta destino!
	public void transferenciaAgenciaConta(Cliente clienteFonte, int agencia, int numeroConta, int valor) {
		for(Conta conta : contas) {
			if(conta.getAgencia() == agencia) {
				if(conta.getConta() == numeroConta) {
					clienteFonte.getConta().transferir(valor, conta);
				}
			}
		}
		
	}
	
	//Transfere para uma conta informando uma chave PIX, isto é, identificando o cliente destino!
	public void transferenciaChavePIX(Cliente clienteFonte, String chavePIX, int valor) {
		for(Cliente cliente : clientes) {
			if(cliente.getChavePIX() == chavePIX) {
					clienteFonte.getConta().transferir(valor, cliente.getConta());
			}
		}
	}

	public void managerListClients() {
		System.out.println("======================================");
		System.out.println("Recursos internos do banco - Lista de Clientes:");
		System.out.println(String.format("Nome---|---Agencia---|---Conta"));
		for(Cliente cliente : clientes) {
			System.out.println(String.format("%-7s|%-13s|%-8s",cliente.getNome(),cliente.getConta().getAgencia(),cliente.getConta().getConta()));
		}
	}
}
