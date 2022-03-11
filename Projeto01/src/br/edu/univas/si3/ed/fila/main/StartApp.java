package br.edu.univas.si3.ed.fila.main;

import br.edu.univas.si3.ed.fila.Fila;
import br.edu.univas.si3.ed.fila.dados.Pessoa;

public class StartApp {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Júlia");
		Pessoa p3 = new Pessoa("Jane");
		
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		fila.inserir(p1);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		fila.inserir(p2);
		System.out.println("Tamanho da fila: " + fila.getTamanho());

		fila.inserir(p3);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
	}
}
