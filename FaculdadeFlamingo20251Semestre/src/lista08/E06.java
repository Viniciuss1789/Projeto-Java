package lista08;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		int quantidade = 0;

		System.out.println("Digite notas de 0 a 10. O programa encerra se for digitada uma nota inválida.");

		System.out.print("Digite uma nota: ");
		double nota = sc.nextDouble();

		while (nota >= 0 && nota <= 10) {
			soma += nota;
			quantidade++;

			System.out.print("Digite outra nota: ");
			nota = sc.nextDouble();
		}

		if (quantidade > 0) {
			double media = soma / quantidade;
			System.out.println("Média das notas válidas: " + media);
		} else {
			System.out.println("Nenhuma nota válida foi inserida.");
		}

		sc.close();
	}
}
