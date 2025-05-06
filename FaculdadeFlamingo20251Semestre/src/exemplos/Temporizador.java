package exemplos;

import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Hora: ");
		int hora = sc.nextInt();
		System.out.print("Minuto: ");
		int minuto = sc.nextInt();
		System.out.print("Segundo: ");
		int segundo = sc.nextInt();

		int totalSegundos = hora * 3600 + minuto * 60 + segundo;

		while (totalSegundos >= 0) {
			int h = totalSegundos / 3600;
			int m = (totalSegundos % 3600) / 60;
			int s = totalSegundos % 60;

			System.out.printf("%02d : %02d : %02d\n", h, m, s);

			Thread.sleep(1);
			totalSegundos--;
		}

		sc.close();
	}
}
