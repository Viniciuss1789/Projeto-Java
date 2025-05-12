package lista07;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a base (B): ");
		int base = scanner.nextInt();

		System.out.print("Informe o expoente (E): ");
		int expoente = scanner.nextInt();

		int resultado = 1;
		int contador = 0;

		while (contador < expoente) {
			resultado *= base;
			contador++;
		}

		System.out.println("Resultado de " + base + "^" + expoente + " = " + resultado);

		scanner.close();
	}
}
