package br.edu.univas.si3.ed.lista;

import br.edu.univas.si3.ed.fila.No;
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
		return null;
	}
	
	public Entidade remover(String nome) {
		//escrever os coment�rios com os passos da execu��o
		
		//cen�rio 1 - remover do in�cio
		No removido = inicio;
		//inicio = inicio.proximo;
		
		//cenario 2 - remover o �ltimo
		//No anterior = ???;
		//No removido = ultimo;
		//ultimo = anteior;
		
		//cen�rio 3 - remover do meio
		//No anterior = ???;
		//No removido = noDaVez;
		//anterior.proximo = removido.proximo;
		
		return removido;
	}
	
	private boolean estaVazia() {
		return inicio == null;
	}
}
