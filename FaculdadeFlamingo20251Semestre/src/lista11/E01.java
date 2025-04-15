package lista11;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;
		for (int numero = 1; numero <= 100; numero++) {
			soma += numero;
			System.out.println(soma);

		}

		sc.close();
	}
}
