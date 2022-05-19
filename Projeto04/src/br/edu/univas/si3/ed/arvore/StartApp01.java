package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.Entidade;
import br.edu.univas.si3.ed.arvore.model.No;

public class StartApp01 {

	public static void main(String[] args) {
		
		//árvore vazia
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();
		System.out.println("Teste 01");
		arvore.imprimir();
		
		Entidade entidadeD = new Entidade("D");
		No noD = arvore.criarNovoNo(entidadeD);
		
		//Cria o nó B
		Entidade entidadeB = new Entidade("B");
		//No noB = arvore.criarNovoNo(entidadeB);
		No noB = arvore.criarSubArvore(entidadeB, null, noD);

		Entidade entidadeE = new Entidade("E");
		No noE = arvore.criarNovoNo(entidadeE);
		Entidade entidadeF = new Entidade("F");
		No noF = arvore.criarNovoNo(entidadeF);
		
		Entidade entidadeC = new Entidade("C");

		//Cria o nó C
		No noC = arvore.criarSubArvore(entidadeC, noE, noF);
		//No noC = arvore.criarNovoNo(entidadeC);
		
		//Cria o nó A
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
