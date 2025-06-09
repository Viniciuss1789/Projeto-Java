package lista12;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String texto = sc.nextLine();

		System.out.println("String invertida:");
		for (int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}

		sc.close();
	}
}
