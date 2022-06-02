package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaBusca;
import br.edu.univas.si3.ed.arvore.model.Entidade;

public class StartApp02 {

	public static void main(String[] args) {
		Entidade e1 = new Entidade("E1", 1);
		Entidade e2 = new Entidade("E2", 2);
		Entidade e3 = new Entidade("E3", 3);
		Entidade e4 = new Entidade("E4", 4);
		Entidade e5 = new Entidade("E5", 5);
		Entidade e6 = new Entidade("E6", 6);

		ArvoreBinariaBusca arvoreBinBusca = new ArvoreBinariaBusca();
		
		arvoreBinBusca.inserir(e4);
		arvoreBinBusca.inserir(e2);
		arvoreBinBusca.inserir(e3);
		arvoreBinBusca.inserir(e1);
		arvoreBinBusca.inserir(e6);
		arvoreBinBusca.inserir(e5);
		
		arvoreBinBusca.imprimir();
	}

}
