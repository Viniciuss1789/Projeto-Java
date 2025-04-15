package lista04;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o comprimento do 1° lado");
		double lado1 = sc.nextDouble();
		System.out.println("Digite o comprimento do 2° lado");
		double lado2 = sc.nextDouble();
		System.out.println("Digite o comprimento do 3° lado");
		double lado3 = sc.nextDouble();

		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
			System.out.println("Os lados formam um triangulo");
		} else {
			System.out.println("Os lados não formam um tranhulo");
		}

		sc.close();
	}

}
