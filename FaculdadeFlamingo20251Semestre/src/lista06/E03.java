package lista06;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double numero1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		double numero2 = sc.nextDouble();

		System.out.print("Digite a operação (+, -, *, /): ");
		char operacao = sc.next().charAt(0);

		double resultado;

		switch (operacao) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case '/':
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Erro: Divisão por zero não é permitida.");
			}
			break;
		default:
			System.out.println("Operação inválida.");
		}

		sc.close();
	}
}
