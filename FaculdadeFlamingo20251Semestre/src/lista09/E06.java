package lista09;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int quantidade = 0;
		double nota;

		do {
			System.out.print("Digite uma nota (0 a 10). Para sair digite um número inválido: ");
			nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				quantidade++;
			}
		} while (nota >= 0 && nota <= 10);

		if (quantidade > 0) {
			System.out.printf("Média das notas: %.2f\n", soma / quantidade);
		} else {
			System.out.println("Nenhuma nota válida foi digitada.");
		}

		sc.close();
	}
}
