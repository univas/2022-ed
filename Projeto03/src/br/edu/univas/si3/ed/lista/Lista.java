package br.edu.univas.si3.ed.lista;

import br.edu.univas.si3.ed.lista.dados.Entidade;

public class Lista {

	private No inicio;
	private No ultimo;
	
	public void inserir(Entidade novo) {
		//criar um nó novo
		No novoNo = new No();
		
		//salvar a entidade dentro do nó
		novoNo.entidade = novo;
		
		//se estiver vazia -> salva o novo nó no início e no último
		if(estaVazia()) {
			inicio = novoNo;
			ultimo = novoNo;
		} else {//se não estiver vazia -> 
			// salva o novo nó no próximo do último
			ultimo.proximo = novoNo;
			// salva o novo nó no último
			ultimo = novoNo;
		}
	}
	
	public void imprimir() {
		//escrever os comentários com os passos da execução
		//inicializa o nó da vez com o 1o nó.
		No noDaVez = inicio;
		
		while(noDaVez != null) { //enquanto o nó da vez não for null
			//imprime o nó da vez
			System.out.print(noDaVez.entidade.nome + " - ");
			//avança o noDaVez para o próximo nó
			noDaVez = noDaVez.proximo;
		}
		System.out.println();
	}
	
	public Entidade buscarPorNome(String nome) {
		//escrever os comentários com os passos da execução
		
		//inicializa o nó da vez com o 1o nó.
		No noDaVez = inicio;
		
		while(noDaVez != null) {//enquanto o nó da vez não for null
			//verifica se o nó da vez tem o nome procurado
			if(noDaVez.entidade.nome.equals(nome)) {
				// se tiver, retorna a entidade que está dentro do nó
				return noDaVez.entidade;
			}
			//avança o noDaVez para o próximo nó
			noDaVez = noDaVez.proximo;
		}
		//retorna null (porque não achou o nome em nenhum nó)
		return null;
	}

	public Entidade buscarNaPosicao(int posicao) {
		//escrever os comentários com os passos da execução
		No noDaVez = inicio;
		int count = 0;
		while(noDaVez != null) {
			
			if(count == posicao) {
				return noDaVez.entidade;
			}
			noDaVez = noDaVez.proximo;
			count++;
		}
		return null;
	}
		
	public Entidade remover(String nomeProcurado) {
		//escrever os comentários com os passos da execução
		
		//caso 1 - lista vazia
		if(estaVazia()) {
			return null;
		}
		
		//Procurar o nó desejado e o anterior junto
			//estratégia: ao navegar, antes de ir para o próximo, guardar o anterior
		No noDaVez = inicio;
		No anterior = null;
		
		//usar o mesmo loop do buscarPorNome
		while(noDaVez != null) {//enquanto o nó da vez não for null
			//verifica se o nó da vez tem o nome procurado
			if(noDaVez.entidade.nome.equals(nomeProcurado)) {
				break; //achou
			}
			//guardar o anterior antes de ir para o próximo
			anterior = noDaVez;
			//avança o noDaVez para o próximo nó
			noDaVez = noDaVez.proximo;
		}
		
		//caso 2 - não achou o nome na lista
		if(noDaVez == null) {
			return null;
		}
		
		//daqui para baixo, achou
		//caso 3 - achou o nome na lista
		
		
		//caso 6 - o próximo do atual é null

		//cenário 1 - remover do início
		if(noDaVez == inicio) { //caso 5 - o anterior é null
			//caso 4 - só tem 1 elemento na lista
			if(inicio == ultimo) {
				inicio = null;
				ultimo = null;
			} else {
				inicio = inicio.proximo;
			}
		} else 
			//cenario 2 - remover o último
			if(noDaVez == ultimo) {
				
				if(inicio == ultimo) {
					inicio = null;
					ultimo = null;
				} else {
					ultimo = anterior;
					anterior.proximo = null;
				}
		} else {
			//cenário 3 - remover do meio
			anterior.proximo = noDaVez.proximo;
		}		
		return noDaVez.entidade;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}
