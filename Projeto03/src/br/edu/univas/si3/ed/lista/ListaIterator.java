package br.edu.univas.si3.ed.lista;

import br.edu.univas.si3.ed.lista.dados.Entidade;

public class ListaIterator {

	private No atual;
	
	public ListaIterator(No inicio) {
		this.atual = inicio;
	}
	
	public Entidade getEntidade() {
		if(atual != null) {
			return atual.entidade;
		}
		return null;
	}
	
	public boolean vaiParaOProximo() {
		if(atual != null) {
			atual = atual.proximo;
			return true;
		}
		return false;
	}
}
