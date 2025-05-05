package lista03;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota (peso 2): ");
		double n1 = sc.nextDouble();

		System.out.print("Digite a segunda nota (peso 3): ");
		double n2 = sc.nextDouble();

		System.out.print("Digite a terceira nota (peso 5): ");
		double n3 = sc.nextDouble();

		double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

		System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);

		sc.close();
	}
}
