package lista13;

public class E02 {
	public static void main(String[] args) {
		
		int[] vetor = { 12, 23, 37, 18, 8, 69 };

		int maior = vetor[0];
		int menor = vetor[0];

		for (int contadora = 0; contadora < vetor.length; contadora++) {
			if (vetor[contadora] > maior) {
				maior = vetor[contadora];

			}
			if (vetor[contadora] < menor) {
				menor = vetor[contadora];
			}
		}

		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numer é " + menor);
	}
}