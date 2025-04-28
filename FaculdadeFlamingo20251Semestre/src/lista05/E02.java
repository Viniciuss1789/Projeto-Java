package lista05;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o comprimento do primeiro lado: ");
		double lado1 = sc.nextDouble();

		System.out.print("Digite o comprimento do segundo lado: ");
		double lado2 = sc.nextDouble();

		System.out.print("Digite o comprimento do terceiro lado: ");
		double lado3 = sc.nextDouble();

		if (Triangulo(lado1, lado2, lado3)) {

			String tipo = Exe02(lado1, lado2, lado3);
			System.out.println("O triângulo é " + tipo + ".");
		} else {
			System.out.println("Os valores fornecidos não formam um triângulo válido.");
		}

		sc.close();
	}

	private static boolean Triangulo(double lado1, double lado2, double lado3) {

		return false;
	}

	private static String Exe02(double lado1, double lado2, double lado3) {

		return null;
	}

}