package lista12;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o início do intervalo: ");
		int inicio = sc.nextInt();
		System.out.print("Digite o fim do intervalo: ");
		int fim = sc.nextInt();

		System.out.println("Números primos no intervalo:");
		for (int i = inicio; i <= fim; i++) {
			boolean primo = true;
			if (i <= 1)
				primo = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo)
				System.out.print(i + " ");
		}

		sc.close();
	}
}
