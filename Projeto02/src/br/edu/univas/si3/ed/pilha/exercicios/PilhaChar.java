package br.edu.univas.si3.ed.pilha.exercicios;

//Tarefa para casa: desenhar o passo-a-passo de cada um dos métodos desta classe.
public class PilhaChar {

	private No topo;
	
	public void inserir(Character novoChar) { //push
		No novoNo = new No();
		novoNo.info = novoChar;
		novoNo.abaixo = topo;
		topo = novoNo;
	}
	
	public Character remover() {//pop
		No removido;
		removido = topo;
		
		if(!estaVazia()) {
			topo = topo.abaixo;
			return removido.info;
		}
		return null;
	}
	
	public boolean estaVazia() {
		return topo == null;
	}
}
