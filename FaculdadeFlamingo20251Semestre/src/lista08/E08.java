package lista08;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine().toLowerCase();

		int contador = 0;
		int i = 0;

		while (i < palavra.length()) {
			char letra = palavra.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}

			i++;
		}

		System.out.println("A palavra contém " + contador + " vogais.");

		sc.close();
	}
}
