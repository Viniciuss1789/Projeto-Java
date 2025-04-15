package lista04;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		
		char letra = sc.next().toLowerCase().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra " + letra + " é uma vogal.");
		} else if ((letra >= 'a' && letra <= 'z')) {
			System.out.println("A letra " + letra + " é uma consoante.");
		} else {
			System.out.println("O caractere inserido não é uma letra válida.");
		}

		sc.close();
	}
}
