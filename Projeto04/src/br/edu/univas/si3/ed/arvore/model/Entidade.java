package br.edu.univas.si3.ed.arvore.model;

public class Entidade {

	public String nome;
	public int idade;
	
	public Entidade() {
	}
	
	public Entidade(String nome) {
		this.nome = nome;
	}
	
	public Entidade(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Entidade [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
