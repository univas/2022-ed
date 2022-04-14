package br.edu.univas.si3.ed.pilha.exercicios.main;

import br.edu.univas.si3.ed.pilha.exercicios.Expressao;

public class StartAppExpressao {

	public static void main(String[] args) {
		System.out.println("Validando express�es.");

		Expressao helper = new Expressao();

		// exemplos de express�es v�lidas
		String exp01 = "a*(b-c)";
		String exp02 = "a*[b/(c-d+e)]";
		String exp03 = "{a+b}+(c-d)";
		String exp04 = "((([(a+b)+c])+d))";
		String exp05 = "((([()])))";
		String exp06 = "{()[()]()()}";

		System.out.println("Express�o " + exp01 + " : " + helper.validarExpressao(exp01));
		System.out.println("Express�o " + exp02 + " : " + helper.validarExpressao(exp02));
		System.out.println("Express�o " + exp03 + " : " + helper.validarExpressao(exp03));
		System.out.println("Express�o " + exp04 + " : " + helper.validarExpressao(exp04));
		System.out.println("Express�o " + exp05 + " : " + helper.validarExpressao(exp05));
		System.out.println("Express�o " + exp06 + " : " + helper.validarExpressao(exp06));

		// TODO: criar exemplos de express�es inv�lidas
		String expInv00 = "a+b)";
		String expInv01 = "((({{[";
		String expInv011 = "()[";

		String expInv02 = "(";
		String expInv03 = ")";
		String expInv04 = "())";

		// TODO: fazer o teste de mesa
		// TODO: testar com outras express�es inv�lidas

		System.out.println("Express�o " + expInv00 + " : " + helper.validarExpressao(expInv00));
		System.out.println("Express�o " + expInv01 + " : " + helper.validarExpressao(expInv01));
		System.out.println("Express�o " + expInv011 + " : " + helper.validarExpressao(expInv011));
		System.out.println("Express�o " + expInv02 + " : " + helper.validarExpressao(expInv02));
		System.out.println("Express�o " + expInv03 + " : " + helper.validarExpressao(expInv03));
		System.out.println("Express�o " + expInv04 + " : " + helper.validarExpressao(expInv04));
	}
}
