package lista4;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		
		int numero = sc.nextInt();

		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O número " + numero + " é divisível por 3 e por 5.");
		} else {
			System.out.println("O número " + numero + " não é divisível por 3 e por 5.");
		}

		sc.close();
	}
}
