package lista08;

import java.util.Scanner;
import java.util.Random;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numeroSecreto = random.nextInt(10) + 1;
		int tentativa;

		System.out.println("Tente adivinhar o número secreto entre 1 e 10.");

		System.out.print("Digite sua tentativa: ");
		tentativa = sc.nextInt();

		while (tentativa != numeroSecreto) {
			System.out.println("Errado! Tente novamente.");
			System.out.print("Digite sua tentativa: ");
			tentativa = sc.nextInt();
		}

		System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);

		sc.close();
	}
}
