package lista11;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Calcule o produto dos números de 1 a 10");

		System.out.println("Digite um número : ");
		int produto = sc.nextInt();

		for (int numero = 1; numero < 11; numero++) {

			System.out.println(numero + " * " + produto + " = " + produto*numero);
		}

		sc.close();
	}

}
