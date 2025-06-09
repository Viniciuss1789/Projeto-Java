package lista13;

public class E04 {

	public static void main(String[] args) {
		
		int[] vetor = { 10, 12, 14, 16, 18, 20 };

		for (int contadora = 0; contadora < vetor.length / 2; contadora++) {
			int num = vetor[contadora];
			vetor[contadora] = vetor[vetor.length - 1 - contadora];
			vetor[vetor.length - 1 - contadora] = num;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}