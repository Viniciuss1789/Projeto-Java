package lista4;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		
		int num2 = sc.nextInt();

		System.out.print("Digite o terceiro número: ");
		
		int num3 = sc.nextInt();

		int maior = num1;

		if (num2 > maior) {
			maior = num2;
		}

		if (num3 > maior) {
			maior = num3;
		}

		System.out.println("O maior número é: " + maior);

		sc.close();
	}
}
