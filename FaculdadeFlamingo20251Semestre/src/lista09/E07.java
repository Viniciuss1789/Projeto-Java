package lista09;

import java.util.Scanner;
import java.util.Random;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numeroSecreto = random.nextInt(10) + 1;
		int palpite;

		do {
			System.out.print("Tente adivinhar o número (1 a 10): ");
			palpite = sc.nextInt();

			if (palpite != numeroSecreto) {
				System.out.println("Errado! Tente novamente.");
			}
		} while (palpite != numeroSecreto);

		System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);
		sc.close();
	}
}
