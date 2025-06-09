package lista13;

import java.util.Scanner;
import java.util.Arrays;

public class E10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do primeiro vetor: ");
		int tamanho1 = sc.nextInt();
		int[] vetor1 = new int[tamanho1];
		System.out.println("Digite os elementos do primeiro vetor:");
		for (int i = 0; i < tamanho1; i++) {
			vetor1[i] = sc.nextInt();
		}
		System.out.print("Digite o tamanho do segundo vetor");
		int tamanho2 = sc.nextInt();
		int[] vetor2 = new int[tamanho2];
		System.out.println("Digite os elementos do segundo vetor:");
		for (int i = 0; i < tamanho2; i++) {
			vetor2[i] = sc.nextInt();
		}

		int[] uniao = new int[tamanho1 + tamanho2];

		for (int i = 0; i < tamanho1; i++) {
			uniao[i] = vetor1[i];
		}
		for (int i = 0; i < tamanho2; i++) {
			uniao[tamanho1 + i] = vetor2[i];
		}
		System.out.println("Vetor união: " + Arrays.toString(uniao));

		sc.close();
	}

}