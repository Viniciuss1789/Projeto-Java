package lista13;

public class E06 {

	public static void main(String[] args) {
		int vetor[] = { 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean[] contador = new boolean[vetor.length];

		for (int contadora = 0; contadora < vetor.length; contadora++) {
			if (contador[contadora]) {
				continue;
			}
			int contador2 = 1;

			for (int contador3 = contadora + 1; contador3 < vetor.length; contador3++) {
				if (vetor[contadora] == vetor[contador3]) {
					contador2++;
					contador[contador3] = true;
				}
			}

			System.out.println("O número " + vetor[contadora] + " aparece " + contador2 + " vezes.");
		}
	}
}