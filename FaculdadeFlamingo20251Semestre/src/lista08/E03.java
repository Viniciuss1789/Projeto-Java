package lista08;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int numero;

		System.out.println("Digite números positivos para somar. Digite um número negativo para encerrar.");

		System.out.print("Digite um número: ");
		numero = sc.nextInt();

		while (numero >= 0) {
			soma += numero;

			System.out.print("Digite outro número: ");
			numero = sc.nextInt();
		}

		System.out.println("A soma dos números positivos é: " + soma);

		sc.close();
	}
}
