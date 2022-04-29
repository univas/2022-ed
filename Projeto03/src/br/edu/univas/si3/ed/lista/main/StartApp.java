package br.edu.univas.si3.ed.lista.main;

import br.edu.univas.si3.ed.lista.Lista;
import br.edu.univas.si3.ed.lista.ListaIterator;
import br.edu.univas.si3.ed.lista.dados.Entidade;

public class StartApp {

	public static void main(String[] args) {
		Lista lista = new Lista();
		//alocar e inserir alguns elementos na lista
		
		ListaIterator it = lista.getIterator();
		
		while(it.vaiParaOProximo()) {
			Entidade obj = it.getEntidade();
			System.out.println(obj);
		}
	}
}
