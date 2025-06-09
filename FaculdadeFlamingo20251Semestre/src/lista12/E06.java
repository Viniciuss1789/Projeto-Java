package lista12;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, quantidade = 0;
		int numero;

		do {
			System.out.print("Digite um número (negativo para encerrar): ");
			numero = sc.nextInt();
			if (numero >= 0) {
				soma += numero;
				quantidade++;
			}
		} while (numero >= 0);

		if (quantidade > 0) {
			double media = (double) soma / quantidade;
			System.out.println("Média: " + media);
		} else {
			System.out.println("Nenhum número válido foi informado.");
		}

		sc.close();
	}
}
