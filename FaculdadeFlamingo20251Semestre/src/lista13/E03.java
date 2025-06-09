package lista13;

public class E03 {

	public static void main(String[] args) {
		
		double[] vetor = { 10.11, 20.41, 38.41, 46.72, 58.98, };
		double media = 0;
		double soma = 0;
		for (int contadora = 0; contadora < vetor.length; contadora++) {
			soma += vetor[contadora];
		}
		media = soma / vetor.length;

		System.out.println("A media dos elementos sao " + media);
	}

}