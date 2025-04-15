package lista04;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("O valor inteiro?");

		int imparOuPar = sc.nextInt();

		if (imparOuPar % 2 == 0) {
			System.out.println("O número é " + imparOuPar + " Par");
		} else {
			System.out.println("O número é " + imparOuPar + " Impar");
		}

		sc.close();

	}

}
