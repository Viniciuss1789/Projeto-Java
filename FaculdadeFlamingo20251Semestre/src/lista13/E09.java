package lista13;

import java.util.Arrays;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor");
		int tamanho = sc.nextInt();
		int[] vetor = new int[tamanho];

		System.out.println("Digite os elementos do vetor");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = sc.nextInt();
		}

		System.out.println("Digite o elemento a ser removido");
		int elementoRemover = sc.nextInt();

		int contador = 0;
		for (int valor : vetor) {
			if (valor == elementoRemover) {
				contador++;
			}
		}
		int[] novoVetor = new int[tamanho - contador];
		int j = 0;
		for (int valor : vetor) {
			if (valor != elementoRemover) {
				novoVetor[j++] = valor;
			}
		}

		System.out.println("Vetor apos a remocao" + Arrays.toString(novoVetor));
		sc.close();
	}

}