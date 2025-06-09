package lista12;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o início do intervalo: ");
		int inicio = sc.nextInt();
		System.out.print("Digite o fim do intervalo: ");
		int fim = sc.nextInt();

		int somaTotal = 0;

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) {
				int numero = i;
				while (numero != 0) {
					somaTotal += numero % 10;
					numero /= 10;
				}
			}
		}

		System.out.println("Soma dos dígitos dos números pares: " + somaTotal);
		sc.close();
	}
}
