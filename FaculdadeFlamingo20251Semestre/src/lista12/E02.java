package lista12;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		int soma = 0;
		String numeroStr = String.valueOf(Math.abs(numero));

		for (int i = 0; i < numeroStr.length(); i++) {
			soma += Character.getNumericValue(numeroStr.charAt(i));
		}

		System.out.println("Soma dos dígitos: " + soma);
		sc.close();
	}
}
