package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.Entidade;
import br.edu.univas.si3.ed.arvore.model.No;

public class StartApp01 {

	public static void main(String[] args) {
		
		//�rvore vazia
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();
		System.out.println("Teste 01");
		arvore.imprimir();

		//Cria o n� B
		Entidade entidadeB = new Entidade("B");
		No noB = arvore.criarNovoNo(entidadeB);
		
		//Cria o n� C
		Entidade entidadeC = new Entidade("C");
		No noC = arvore.criarNovoNo(entidadeC);
		
		//Cria o n� A
		Entidade entidadeA = new Entidade("A");
		arvore.criarRaiz(entidadeA, noB, noC);
		System.out.println("Teste 02");
		arvore.imprimir();
		
		
//		System.out.println("Teste xuxa");
//		Entidade xuxa = new Entidade("X");
//		No noX = arvore.criarNovoNo(xuxa);
//		arvore.imprimirPreOrdem(noX, "*");
	}
}
