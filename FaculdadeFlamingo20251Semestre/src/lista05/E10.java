package lista05;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O número é divisível por 3 e por 5.");
		} else if (numero % 3 == 0) {
			System.out.println("O número é divisível apenas por 3.");
		} else if (numero % 5 == 0) {
			System.out.println("O número é divisível apenas por 5.");
		} else {
			System.out.println("O número não é divisível por 3 nem por 5.");
		}

		sc.close();
	}
}
