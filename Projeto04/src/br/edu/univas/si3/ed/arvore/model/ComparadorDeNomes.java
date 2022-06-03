package br.edu.univas.si3.ed.arvore.model;

import java.util.Comparator;

public class ComparadorDeNomes  implements Comparator<Entidade> {

	//negativo -> menor
	//0  -> igual
	//positivo -> maior
	@Override
	public int compare(Entidade e1, Entidade e2) {
		return e1.nome.compareTo(e2.nome);
	}
}
