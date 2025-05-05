package lista02;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		int soma = 0;
		int numeroAbsoluto = Math.abs(numero);

		while (numeroAbsoluto > 0) {
			int digito = numeroAbsoluto % 10;
			soma += digito;
			numeroAbsoluto /= 10;
		}

		System.out.println("A soma dos dígitos é: " + soma);

		sc.close();
	}
}
