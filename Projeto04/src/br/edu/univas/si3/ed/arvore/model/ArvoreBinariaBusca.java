package br.edu.univas.si3.ed.arvore.model;

import java.util.Comparator;

public class ArvoreBinariaBusca {

	private No raiz;
	
	//Exercício: modificar o inserir para usar um comparador
	
	public void inserir(Entidade entidade) {
		if(raiz == null) {
			raiz = criarNo(entidade);
		} else {
			inserirNoInterno(raiz, entidade);
		}
	}
	
	private void inserirNoInterno(No raizDaSubArvore, Entidade novaEntidade) {
		if(novaEntidade.idade == raizDaSubArvore.entidade.idade) {
			return;
		}
		if(novaEntidade.idade < raizDaSubArvore.entidade.idade) {//ir para a esquerda
			if(raizDaSubArvore.esquerda == null) {
				raizDaSubArvore.esquerda = criarNo(novaEntidade);
			} else {
				inserirNoInterno(raizDaSubArvore.esquerda, novaEntidade);
			}
		} else { //vai para a direita
			if(raizDaSubArvore.direita == null) {
				raizDaSubArvore.direita = criarNo(novaEntidade);
			} else {
				inserirNoInterno(raizDaSubArvore.direita, novaEntidade);
			}
		}
	}
	
	public No criarNo(Entidade novaEntidade) {
		No novoNo = new No();
		novoNo.entidade = novaEntidade;
		return novoNo;
	}
	
	public Entidade buscar(Entidade entidadeBuscada, Comparator<Entidade> comparador) {
		return buscarInterno(raiz, entidadeBuscada, comparador);
	}
	
	private Entidade buscarInterno(No raizDaSubArvore, Entidade entidadeBuscada, Comparator<Entidade> comparador) {
		if(raizDaSubArvore == null) {
			return null;
		}
		int result = comparador.compare(entidadeBuscada, raizDaSubArvore.entidade);
		if(result == 0) {
			return raizDaSubArvore.entidade;
		} else if(result < 0) { //negativo
			return buscarInterno(raizDaSubArvore.esquerda, entidadeBuscada, comparador);
		} else {
			return buscarInterno(raizDaSubArvore.direita, entidadeBuscada, comparador);
		}
	}

	public void imprimir() {
		System.out.println("Iniciando impressão da árvore.");
		imprimirPreOrdem(raiz);
		System.out.println();
	}
	
	private void imprimirPreOrdem(No raizDaSubArvore) {
		if(raizDaSubArvore == null) {
			return;
		}
		System.out.print(raizDaSubArvore.entidade.idade + ",");
		imprimirPreOrdem(raizDaSubArvore.esquerda); 
		imprimirPreOrdem(raizDaSubArvore.direita);
	}
}
