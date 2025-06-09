package lista10;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o dividendo: ");
		int dividendo = sc.nextInt();

		System.out.print("Digite o divisor: ");
		int divisor = sc.nextInt();

		int quociente = 0;
		int acumulador = 0;

		if (divisor == 0) {
			System.out.println("Divisão por zero não é permitida.");
		} else {
			do {
				acumulador += divisor;
				if (acumulador <= dividendo) {
					quociente++;
				}
			} while (acumulador + divisor <= dividendo);

			System.out.println("Resultado da divisão inteira: " + quociente);
		}

		sc.close();
	}
}
