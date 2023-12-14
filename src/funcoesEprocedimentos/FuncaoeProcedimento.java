package funcoesEprocedimentos;

import java.util.Scanner;

public class FuncaoeProcedimento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		imprimir();
		String simbolo;
		System.out.println("Qual opera��o?");
		simbolo = teclado.next();

		while (simbolo.intern() != "+" && simbolo.intern() != "-" && simbolo.intern() != "*"
				&& simbolo.intern() != "/") {
			System.out.println("Qual opera��o?");
			simbolo = teclado.next();
		}

		switch (simbolo) {
		case "+":
			System.out.println(soma());
			break;
		case "-":
			System.out.println(subtracao());
			break;
		case "*":
			System.out.println(multiplicacao());
			break;
		case "/":
			System.out.println(divisao());
			break;
		default:
			System.out.println("Qual opera��o?");
			simbolo = teclado.next();

		}

	}

	public static double soma() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, soma;
		System.out.println("Informe n1:");
		n1 = teclado.nextDouble();
		System.out.println("Informe n2:");
		n2 = teclado.nextDouble();
		soma = n1 + n2;
		return soma;
	}

	public static double multiplicacao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, multiplicacao;
		System.out.println("Informe a multip. n1:");
		n1 = teclado.nextDouble();
		System.out.println("Informe o n2:");
		n2 = teclado.nextDouble();
		multiplicacao = n1 * n2;
		return multiplicacao;
	}

	public static double subtracao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, subtracao;
		System.out.println("Informe a subtr. n1:");
		n1 = teclado.nextDouble();
		System.out.println("Informe o n2:");
		n2 = teclado.nextDouble();
		subtracao = n1 - n2;
		return subtracao;
	}

	public static double divisao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, divisao;
		System.out.println("Informe a divis. n1:");
		n1 = teclado.nextDouble();
		System.out.println("Informe o n2:");
		n2 = teclado.nextDouble();
		divisao = n1 / n2;
		return divisao;
	}

	public static void imprimir() {
		System.out.println("Bem Vindo ao Jogo");
		System.out.println("Ganha quem adivinhar mais");
		return;
	}

}
