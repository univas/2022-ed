package br.edu.univas.si3.ed.pilha.exercicios.main;

import br.edu.univas.si3.ed.pilha.exercicios.Expressao;

public class StartAppExpressao {

	public static void main(String[] args) {
		System.out.println("Validando expressões.");

		Expressao helper = new Expressao();

		// exemplos de expressões válidas
		String exp01 = "a*(b-c)";
		String exp02 = "a*[b/(c-d+e)]";
		String exp03 = "{a+b}+(c-d)";
		String exp04 = "((([(a+b)+c])+d))";
		String exp05 = "((([()])))";
		String exp06 = "{()[()]()()}";

		System.out.println("Expressão " + exp01 + " : " + helper.validarExpressao(exp01));
		System.out.println("Expressão " + exp02 + " : " + helper.validarExpressao(exp02));
		System.out.println("Expressão " + exp03 + " : " + helper.validarExpressao(exp03));
		System.out.println("Expressão " + exp04 + " : " + helper.validarExpressao(exp04));
		System.out.println("Expressão " + exp05 + " : " + helper.validarExpressao(exp05));
		System.out.println("Expressão " + exp06 + " : " + helper.validarExpressao(exp06));

		// TODO: criar exemplos de expressões inválidas
		String expInv00 = "a+b)";
		String expInv01 = "((({{[";
		String expInv011 = "()[";

		String expInv02 = "(";
		String expInv03 = ")";
		String expInv04 = "())";

		// TODO: fazer o teste de mesa
		// TODO: testar com outras expressões inválidas

		System.out.println("Expressão " + expInv00 + " : " + helper.validarExpressao(expInv00));
		System.out.println("Expressão " + expInv01 + " : " + helper.validarExpressao(expInv01));
		System.out.println("Expressão " + expInv011 + " : " + helper.validarExpressao(expInv011));
		System.out.println("Expressão " + expInv02 + " : " + helper.validarExpressao(expInv02));
		System.out.println("Expressão " + expInv03 + " : " + helper.validarExpressao(expInv03));
		System.out.println("Expressão " + expInv04 + " : " + helper.validarExpressao(expInv04));
	}
}
