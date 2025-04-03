package lista4;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Precisa ter 18+ para beber");
		int idade = sc.nextInt();

		if (idade <= 17) {
			System.out.println("Você não tem idade para beber");
		} else {
			System.out.println("Você tem idade para beber");
		}

		sc.close();
	}

}
