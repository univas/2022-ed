package br.edu.univas.si3.ed.lista;

import br.edu.univas.si3.ed.lista.dados.Entidade;

public class Lista {

	private No inicio;
	private No ultimo;
	
	public void inserir(Entidade novo) {
		//criar um n� novo
		No novoNo = new No();
		
		//salvar a entidade dentro do n�
		novoNo.entidade = novo;
		
		//se estiver vazia -> salva o novo n� no in�cio e no �ltimo
		if(estaVazia()) {
			inicio = novoNo;
			ultimo = novoNo;
		} else {//se n�o estiver vazia -> 
			// salva o novo n� no pr�ximo do �ltimo
			ultimo.proximo = novoNo;
			// salva o novo n� no �ltimo
			ultimo = novoNo;
		}
	}
	
	public void imprimir() {
		//escrever os coment�rios com os passos da execu��o
		//inicializa o n� da vez com o 1o n�.
		No noDaVez = inicio;
		
		while(noDaVez != null) { //enquanto o n� da vez n�o for null
			//imprime o n� da vez
			System.out.print(noDaVez.entidade.nome + " - ");
			//avan�a o noDaVez para o pr�ximo n�
			noDaVez = noDaVez.proximo;
		}
		System.out.println();
	}
	
	public Entidade buscarPorNome(String nome) {
		//escrever os coment�rios com os passos da execu��o
		
		//inicializa o n� da vez com o 1o n�.
		No noDaVez = inicio;
		
		while(noDaVez != null) {//enquanto o n� da vez n�o for null
			//verifica se o n� da vez tem o nome procurado
			if(noDaVez.entidade.nome.equals(nome)) {
				// se tiver, retorna a entidade que est� dentro do n�
				return noDaVez.entidade;
			}
			//avan�a o noDaVez para o pr�ximo n�
			noDaVez = noDaVez.proximo;
		}
		//retorna null (porque n�o achou o nome em nenhum n�)
		return null;
	}

	public Entidade buscarNaPosicao(int posicao) {
		//escrever os coment�rios com os passos da execu��o
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
		//escrever os coment�rios com os passos da execu��o
		
		//caso 1 - lista vazia
		if(estaVazia()) {
			return null;
		}
		
		//Procurar o n� desejado e o anterior junto
			//estrat�gia: ao navegar, antes de ir para o pr�ximo, guardar o anterior
		No noDaVez = inicio;
		No anterior = null;
		
		//usar o mesmo loop do buscarPorNome
		while(noDaVez != null) {//enquanto o n� da vez n�o for null
			//verifica se o n� da vez tem o nome procurado
			if(noDaVez.entidade.nome.equals(nomeProcurado)) {
				break; //achou
			}
			//guardar o anterior antes de ir para o pr�ximo
			anterior = noDaVez;
			//avan�a o noDaVez para o pr�ximo n�
			noDaVez = noDaVez.proximo;
		}
		
		//caso 2 - n�o achou o nome na lista
		if(noDaVez == null) {
			return null;
		}
		
		//daqui para baixo, achou
		//caso 3 - achou o nome na lista
		
		
		//caso 6 - o pr�ximo do atual � null

		//cen�rio 1 - remover do in�cio
		if(noDaVez == inicio) { //caso 5 - o anterior � null
			//caso 4 - s� tem 1 elemento na lista
			if(inicio == ultimo) {
				inicio = null;
				ultimo = null;
			} else {
				inicio = inicio.proximo;
			}
		} else 
			//cenario 2 - remover o �ltimo
			if(noDaVez == ultimo) {
				
				if(inicio == ultimo) {
					inicio = null;
					ultimo = null;
				} else {
					ultimo = anterior;
					anterior.proximo = null;
				}
		} else {
			//cen�rio 3 - remover do meio
			anterior.proximo = noDaVez.proximo;
		}		
		return noDaVez.entidade;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}
