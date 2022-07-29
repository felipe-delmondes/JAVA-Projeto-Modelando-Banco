package com.dio.projeto;

public interface operacoesBasicas {
	void sacar(int valor);
	void depositar(int valor);
	void transferir(int valor, Conta conta);
	void Extrato();
}
