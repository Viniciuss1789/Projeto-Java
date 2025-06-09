package lista09;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para ver a tabuada: ");
		int numero = sc.nextInt();

		int i = 1;

		do {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
			i++;
		} while (i <= 10);

		sc.close();
	}
}
