package lista05;

import java.util.Scanner;

public class E07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota (0 a 100): ");
		int nota = sc.nextInt();

		if (nota < 0 || nota > 100) {
			System.out.println("Nota inválida. Digite um valor entre 0 e 100.");
		} else if (nota >= 90) {
			System.out.println("Nota: A");
		} else if (nota >= 80) {
			System.out.println("Nota: B");
		} else if (nota >= 70) {
			System.out.println("Nota: C");
		} else if (nota >= 60) {
			System.out.println("Nota: D");
		} else {
			System.out.println("Nota: F");
		}

		sc.close();
	}
}
