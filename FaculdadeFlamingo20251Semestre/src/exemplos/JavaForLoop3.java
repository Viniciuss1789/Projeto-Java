package exemplos;

import java.util.Scanner;

public class JavaForLoop3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int contadora = 1; contadora <= 2; contadora++) {
			System.out.println("Lider: " + contadora + "°");

			for (int contador = 1; contador <= 5; contador++) {
				System.out.println(" Time: " + contador);
			}
		}

		sc.close();
	}

}
