package lista09;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = sc.nextInt();

		long fatorial = 1;
		int i = numero;

		do {
			if (i <= 1)
				break;
			fatorial *= i;
			i--;
		} while (i > 1);

		System.out.println("Fatorial de " + numero + " é: " + fatorial);

		sc.close();
	}
}
