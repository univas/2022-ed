package br.edu.univas.si3.ed.lista;

import br.edu.univas.si3.ed.fila.No;
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
		return null;
	}
	
	public Entidade remover(String nome) {
		//escrever os comentários com os passos da execução
		
		//cenário 1 - remover do início
		No removido = inicio;
		//inicio = inicio.proximo;
		
		//cenario 2 - remover o último
		//No anterior = ???;
		//No removido = ultimo;
		//ultimo = anteior;
		
		//cenário 3 - remover do meio
		//No anterior = ???;
		//No removido = noDaVez;
		//anterior.proximo = removido.proximo;
		
		return removido;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}
