package lista02;

import java.util.Scanner;

public class E04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a base do triângulo: ");
		double base = sc.nextDouble();

		System.out.print("Digite a altura do triângulo: ");
		double altura = sc.nextDouble();

		double area = (base * altura) / 2;

		double perimetro = 3 * base;

		System.out.println("Área do triângulo: " + area);
		System.out.println("Perímetro do triângulo (equilátero): " + perimetro);

		sc.close();
	}
}
