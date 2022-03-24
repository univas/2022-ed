package br.edu.univas.si3.ed.fila;

import br.edu.univas.si3.ed.fila.dados.Pessoa;

public class Fila {

	private No inicio = null;
	private No ultimo = null;
	private int tamanho = 0;
	
	public int comprimento() {
		int comprimento = 0;
		No atual = inicio;

		//navega na fila do início até o fim, contando cada elemento
		while(atual != null) {
			comprimento++;
			atual = atual.proximo;
		}
		return comprimento;
	}
	
	public void inserir(Pessoa novaPessoa) {
		No novo = new No();
		novo.pessoa = novaPessoa;
		if(estaVazia()) {
			inicio = novo;
		} else {
			ultimo.proximo = novo;
		}
		ultimo = novo;
		tamanho++;
	}
	
	public Pessoa remover() {
		No removido;
		removido = inicio;
		if(!estaVazia()) {
			inicio = inicio.proximo; //move o início para o 2o
			tamanho--;
		} else {
			ultimo = null;
		}
		if(removido != null) {
			return removido.pessoa;
		} else {
			return null;
		}
	}
	
	public void imprimir() {
		No noDaVez = inicio;
		
		while(noDaVez != null) {
			System.out.print(noDaVez.pessoa.nome + " - ");
			noDaVez = noDaVez.proximo;
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