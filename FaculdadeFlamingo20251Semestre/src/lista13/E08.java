package lista13;

public class E08 {

	public static boolean Exerc8(int[] vetor, int elemento) {
		for (int num : vetor) {
			if (num == elemento) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] vetor = { 10, 20, 30, 40, 50 };
		int elementoParaBuscar = 30;

		boolean encontrado = Exerc8(vetor, elementoParaBuscar);

		if (encontrado) {
			System.out.println("Elemento " + elementoParaBuscar + " está presente no vetor.");
		} else {
			System.out.println("Elemento " + elementoParaBuscar + " NÃO está presente no vetor.");
		}
	}

}