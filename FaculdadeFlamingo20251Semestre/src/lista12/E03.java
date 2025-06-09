package lista12;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de termos: ");
		int n = sc.nextInt();

		System.out.println("Série de números triangulares:");
		for (int i = 1; i <= n; i++) {
			int triangular = (i * (i + 1)) / 2;
			System.out.print(triangular + " ");
		}

		sc.close();
	}
}
