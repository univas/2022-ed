package br.edu.univas.si3.ed.fila;

import br.edu.univas.si3.ed.fila.dados.Pessoa;

public class Fila {

	private Pessoa inicio = null;
	private Pessoa ultimo = null;
	private int tamanho = 0;
	
	public void inserir(Pessoa novo) {
		if(estaVazia()) {
			inicio = novo;
		} else {
			ultimo.proximo = novo;
		}
		ultimo = novo;
		tamanho++;
	}
	
	public Pessoa remover() {
		Pessoa removido;
		removido = inicio;
		if(!estaVazia()) {
			inicio = inicio.proximo; //move o início para o 2o
			tamanho--;
		} else {
			ultimo = null;
		}
		return removido;
	}
	
	public void imprimir() {
		Pessoa pessoaDaVez = inicio;
		
		while(pessoaDaVez != null) {
			System.out.print(pessoaDaVez.nome + " - ");
			pessoaDaVez = pessoaDaVez.proximo;
		}
		System.out.println();
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}