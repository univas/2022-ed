package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaBusca {

	private No raiz;
	
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
	
	public void imprimir() {
		System.out.println("Iniciando impressão da árvore.");
		imprimirPreOrdem(raiz);
	}
	
	private void imprimirPreOrdem(No raizDaSubArvore) {
		if(raizDaSubArvore == null) {
			return;
		}
		System.out.println(raizDaSubArvore.entidade.idade);
		imprimirPreOrdem(raizDaSubArvore.esquerda); 
		imprimirPreOrdem(raizDaSubArvore.direita);
	}
}
