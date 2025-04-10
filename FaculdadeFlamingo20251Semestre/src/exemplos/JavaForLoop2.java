package exemplos;

import java.util.Scanner;

public class JavaForLoop2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int contadora = 0; contadora <= 40; contadora = contadora + 2) {
			System.out.println(contadora);
		}

		sc.close();
	}

}
