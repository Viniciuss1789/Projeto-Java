package lista08;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = sc.nextInt();

		int fatorial = 1;
		int i = numero;

		while (i > 1) {
			fatorial *= i;
			i--;
		}

		System.out.println("O fatorial de " + numero + " é: " + fatorial);

		sc.close();
	}
}
