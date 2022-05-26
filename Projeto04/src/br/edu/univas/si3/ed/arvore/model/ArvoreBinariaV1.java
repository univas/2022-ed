package br.edu.univas.si3.ed.arvore.model;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("Iniciando impress�o da �rvore.");
		//imprimirPreOrdem(raiz, "$");
		imprimirEmOrdem(raiz);
	}
	
	//m�todo recursivo
	private void imprimirPreOrdem(No raizDaSubArvore, String cenario) {
		//System.out.println("Cen�rio: " + cenario);
		if(raizDaSubArvore == null) {
			return;
		}
		System.out.println(cenario + " : " + raizDaSubArvore.entidade.nome);
		imprimirPreOrdem(raizDaSubArvore.esquerda, cenario + "<"); 
		imprimirPreOrdem(raizDaSubArvore.direita, cenario + ">");
	}
	
	private void imprimirEmOrdem(No raizDaSubArvore) {
		if(raizDaSubArvore == null) {
			return;
		}
		imprimirEmOrdem(raizDaSubArvore.esquerda);
		System.out.println(raizDaSubArvore.entidade.nome);
		imprimirEmOrdem(raizDaSubArvore.direita);
	}
	
	private void imprimirPosOrdem(No raizDaSubArvore) {
		if(raizDaSubArvore == null) {
			return;
		}
		imprimirPosOrdem(raizDaSubArvore.esquerda);
		imprimirPosOrdem(raizDaSubArvore.direita);
		System.out.println(raizDaSubArvore.entidade.nome);
	}
	
	//Exercícios

	//exercício 7-b
	public int quantidadeNos() {
		return calcularQuantidadeNos(raiz);
	}

	private int calcularQuantidadeNos(No no) {
		if(no == null) {
			return 0;
		}
		int qtdEsquerda = calcularQuantidadeNos(no.esquerda);
		int qtdDireita = calcularQuantidadeNos(no.direita);
		return 1 + qtdEsquerda + qtdDireita;
		
		//return 1 + calcularQuantidadeNos(no.esq) + calcularQuantidadeNos(no.dir);
	}

	//exercício 7-a
	public int altura() {
		return calcularMaiorNivel(raiz, 0);
	}
	
	private int calcularMaiorNivel(No no, int nivel) {
		if(no == null) {
			return nivel - 1;
		}
		int nivelEsquerda = calcularMaiorNivel(no.esquerda, nivel + 1);
		int nivelDireita = calcularMaiorNivel(no.direita, nivel + 1);
		return Math.max(nivelEsquerda, nivelDireita);
	}
	
	//exercício 8 (1a opção)
	public Entidade buscarElemento(String buscado) { //sem recurssividade
		return buscarElementoRecursivo(raiz, buscado);
	}

	private Entidade buscarElementoRecursivo(No raizDaSubArvore, String buscado) {
		if(raizDaSubArvore == null) {
			return null;
		}
		if(raizDaSubArvore.entidade.nome.equals(buscado)) {
			return raizDaSubArvore.entidade;
		}
		Entidade encontouEsq = buscarElementoRecursivo(raizDaSubArvore.esquerda, buscado);
		if(encontouEsq != null) {
			return encontouEsq;
		}
		return buscarElementoRecursivo(raizDaSubArvore.direita, buscado);
	}

	//exercício 8 (2a opção)
	public Entidade buscarElementoNR(String buscado) { //NR: Não Recurssivo

		//Esta implementação é conhecida como "Busca em Largura".
		//TODO: fazer o teste de mesa
		
		List<No> aguardando = new ArrayList<>();
		aguardando.add(raiz);
		
		while(!aguardando.isEmpty()) {
			No current = aguardando.remove(0); //pega o 1o elemento da lista
			if(current.entidade.nome.equals(buscado)) {
				return current.entidade; //achou o objeto buscado
			}
			if(current.esquerda != null) {
				aguardando.add(current.esquerda);
			}
			if(current.direita != null) {
				aguardando.add(current.direita);
			}
		}
		return null; //não achou
	}	

}
