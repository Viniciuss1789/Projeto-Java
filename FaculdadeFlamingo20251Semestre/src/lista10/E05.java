package lista10;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		long somaFatoriais = 0;

		do {
			System.out.print("Digite um número inteiro (" + (contador + 1) + "/15): ");
			int numero = sc.nextInt();
			long fatorial = 1;
			for (int i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			somaFatoriais += fatorial;
			contador++;
		} while (contador < 15);

		System.out.println("Somatório dos fatoriais: " + somaFatoriais);
		sc.close();
	}
}
