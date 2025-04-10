package exemplos;

import java.util.Scanner;

public class JavaForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int contadora = 1; contadora <= 7; contadora++) {
			System.out.println(contadora + "°" + " Gol da Alemanha");
		}
		sc.close();
	}

}
