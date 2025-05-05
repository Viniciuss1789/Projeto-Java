package lista03;

import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.printf("A temperatura em graus Celsius é: %.2f°C\n", celsius);

		sc.close();
	}
}
