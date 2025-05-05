package lista03;

import java.util.Scanner;

public class E08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número total de eleitores: ");
		int totalEleitores = sc.nextInt();

		System.out.print("Digite o número de votos brancos: ");
		int votosBrancos = sc.nextInt();

		System.out.print("Digite o número de votos nulos: ");
		int votosNulos = sc.nextInt();

		System.out.print("Digite o número de votos válidos: ");
		int votosValidos = sc.nextInt();

		int somaVotos = votosBrancos + votosNulos + votosValidos;

		if (somaVotos > totalEleitores) {
			System.out.println("Erro: A soma dos votos excede o total de eleitores.");
		} else {

			double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
			double percentualNulos = (votosNulos * 100.0) / totalEleitores;
			double percentualValidos = (votosValidos * 100.0) / totalEleitores;

			System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
			System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
			System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
		}

		sc.close();
	}
}
