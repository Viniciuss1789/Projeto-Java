package lista13;

public class E07 {

	public static void main(String[] args) {
		int[] vetor = { 5, 2, 9, 1, 5, 6 };

		System.out.println("Vetor original:");
		imprimirVetor(vetor);

		bubbleSortCrescente(vetor);

		System.out.println("\nVetor ordenado em ordem crescente:");
		imprimirVetor(vetor);
	}

	public static void bubbleSortCrescente(int[] vetor) {
		int n = vetor.length;
		boolean trocou;

		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {

					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					trocou = true;
				}
			}
			if (!trocou)
				break;
		}
	}

	public static void imprimirVetor(int[] vetor) {
		for (int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}