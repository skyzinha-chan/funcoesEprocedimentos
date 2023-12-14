package funcoesEprocedimentos;

import java.util.Scanner;

public class FuncaoeProcedimento2comSwitc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String simbolo;
		System.out.println("Qual operação?");
		simbolo = teclado.next();
		while (simbolo.intern() != "+" && simbolo.intern() != "-" && simbolo.intern() != "*"
				&& simbolo.intern() != "/") {
			System.out.println("Qual operação?");
			simbolo = teclado.next();
		}

		double n1, n2;
		System.out.println("Informe o n1:");
		n1 = teclado.nextDouble();
		System.out.println("Informe o n2:");
		n2 = teclado.nextDouble();

		switch (simbolo) {
		case "+":
			System.out.println(soma(n1, n2));
			break;
		case "-":
			System.out.println(subtracao(n1, n2));
			break;
		case "*":
			System.out.println(multiplicacao(n1, n2));
			break;
		case "/":
			System.out.println(divisao(n1, n2));
			break;

		}

	}

	public static double soma(double n1, double n2) {
		double soma;
		soma = n1 + n2;
		return soma;
	}

	public static double subtracao(double n1, double n2) {
		double subtracao;
		subtracao = n1 - n2;
		return subtracao;
	}

	public static double multiplicacao(double n1, double n2) {
		double multiplicacao;
		multiplicacao = n1 * n2;
		return multiplicacao;
	}

	public static double divisao(double n1, double n2) {
		double divisao;
		divisao = n1 / n2;
		return divisao;
	}

	public static void imprimir() {
		System.out.println("Bem Vindo ao Jogo");
		System.out.println("Ganha quem adivinhar mais");
		return;
	}

}
