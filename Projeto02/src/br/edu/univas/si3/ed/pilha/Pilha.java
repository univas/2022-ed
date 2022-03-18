package br.edu.univas.si3.ed.pilha;

import br.edu.univas.si3.ed.pilha.dados.Livro;

//Tarefa para casa: desenhar o passo-a-passo de cada um dos métodos desta classe.
//Implementar o main para testar a pilha
public class Pilha {

	private No topo;
	
	public void inserir(Livro novoLivro) { //push
		No novoNo = new No();
		novoNo.item = novoLivro;
		novoNo.abaixo = topo;
		topo = novoNo;
	}
	
	public Livro remover() {//pop
		No removido;
		removido = topo;
		
		if(!estaVazia()) {
			topo = topo.abaixo;
			return removido.item;
		}
		return null;
	}
	
	public boolean estaVazia() {
		return topo == null;
	}
}
