package lista12;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você quer digitar? ");
		int quantidade = sc.nextInt();

		int pares = 0, impares = 0;

		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			int numero = sc.nextInt();
			if (numero % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.println("Total de pares: " + pares);
		System.out.println("Total de ímpares: " + impares);
		sc.close();
	}
}
