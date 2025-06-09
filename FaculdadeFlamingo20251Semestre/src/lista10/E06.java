package lista10;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalValores = 0;
		int soma = 0;
		int valor;

		do {
			System.out.print("Digite um valor positivo (ou negativo para sair): ");
			valor = sc.nextInt();

			if (valor >= 0) {
				soma += valor;
				totalValores++;
			}
		} while (valor >= 0);

		if (totalValores > 0) {
			double media = (double) soma / totalValores;
			System.out.println("Total de valores: " + totalValores);
			System.out.println("Somatório: " + soma);
			System.out.println("Média: " + media);
		} else {
			System.out.println("Nenhum valor positivo foi informado.");
		}

		sc.close();
	}
}
