package lista11;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcule a soma dos números de 1 a 100");
		
		int acomuladora = 0;
		for (int numero = 1; numero < 101; numero++) {
			acomuladora = acomuladora + numero;
			System.out.println(acomuladora);

		}
		sc.close();
	}
}
