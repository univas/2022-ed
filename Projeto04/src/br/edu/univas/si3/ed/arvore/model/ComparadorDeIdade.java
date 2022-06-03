package br.edu.univas.si3.ed.arvore.model;

import java.util.Comparator;

public class ComparadorDeIdade implements Comparator<Entidade> {

	//-1 -> menor
	//0  -> igual
	//+1 -> maior
	@Override
	public int compare(Entidade e1, Entidade e2) {
		if(e1.idade == e2.idade) {
			return 0;
		} else if(e1.idade < e2.idade) {
			return -1;
		} else {
			return +1;
		}
	}
}
