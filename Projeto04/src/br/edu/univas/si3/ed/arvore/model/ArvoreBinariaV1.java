package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaV1 {
	private No raiz;
	
	public No criarNovoNo(Entidade novaEntidade) {
		No novoNo = new No();
		novoNo.entidade = novaEntidade;
		return novoNo;
	}
	
	public No criarSubArvore(Entidade entidadePai, No esquerda, No direita) {
		No pai = criarNovoNo(entidadePai);
		pai.esquerda = esquerda;
		pai.direita = direita;
		return pai;
	}
	
	public void criarRaiz(Entidade entidadePai, No esquerda, No direita) {
		raiz = criarSubArvore(entidadePai, esquerda, direita);
	}
	
	public void imprimir() {
		System.out.println("Iniciando impressão da árvore.");
		imprimirPreOrdem(raiz, "$");
	}
	
	//método recursivo
	public void imprimirPreOrdem(No raizDaSubArvore, String cenario) {
		System.out.println("Cenário: " + cenario);
		if(raizDaSubArvore == null) {
			return;
		}
		System.out.println(cenario + " : " + raizDaSubArvore.entidade.nome);
		imprimirPreOrdem(raizDaSubArvore.esquerda, cenario + "<"); 
		imprimirPreOrdem(raizDaSubArvore.direita, cenario + ">");
	}
}
