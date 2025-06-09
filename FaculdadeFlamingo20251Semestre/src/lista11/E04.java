package lista11;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para ver sua tabuada: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		sc.close();
	}
}
