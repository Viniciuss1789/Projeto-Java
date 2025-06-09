package lista09;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para iniciar a contagem regressiva: ");
		int numero = sc.nextInt();

		do {
			System.out.println(numero);
			numero--;
		} while (numero >= 0);

		sc.close();
	}
}
