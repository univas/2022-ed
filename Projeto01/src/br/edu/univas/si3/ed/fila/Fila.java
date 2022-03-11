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
	
	public int getTamanho() {
		return tamanho;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}