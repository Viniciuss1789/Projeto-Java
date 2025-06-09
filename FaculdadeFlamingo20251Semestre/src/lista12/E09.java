package lista12;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Números em ordem inversa:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}

		sc.close();
	}
}
