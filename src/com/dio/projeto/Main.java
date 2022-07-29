package com.dio.projeto;

public class Main {

	public static void main(String[] args) {
		
		int agencias[] =  {1,2,3,4,5,6,7,8,9,10};
		
		Banco Bradesco = new Banco("Bradesco SA",agencias);
		
		//Conta 1
		Cliente Felipinho = Bradesco.novoCliente("Felipe", "Delmondes Aires de Brito");
		Bradesco.novaContaCorrente(Felipinho, 6, 500);
		Felipinho.getConta().depositar(20);
		
		//Conta 2
		Cliente SteveJobs = Bradesco.novoCliente("Steve", "Jobs");
		Bradesco.novaContaCorrente(SteveJobs, 3, 3000);
		
		//Conta 3
		Cliente Stephen = Bradesco.novoCliente("Stephen", "Hawking");
		Bradesco.novaContaCorrente(Stephen, 7, 900);
		
		//Stephen transfere R$ para Agência 6 conta 1!
		Bradesco.transferenciaAgenciaConta(Stephen, 6, 1, 50);
		
		//Extrai Extratos
		Felipinho.getConta().Extrato();
		Stephen.getConta().Extrato();
		
		
		//O Super Manager imprime a lista de clientes para uma auditoria Interna
		Bradesco.managerListClients();
		
		

	}

}
