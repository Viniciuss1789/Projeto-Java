package lista11;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			double numero = sc.nextDouble();
			soma += numero;
		}

		double media = soma / 10;
		System.out.println("Média dos 10 números: " + media);
		sc.close();
	}
}
