package lista13;

public class E01 {

	public static void main(String[] args) {
		int[] numeros = { 10, 20, 30, 20 };
		int soma = 0;
		for (int contadora = 0; contadora < numeros.length; contadora++) {
			soma += numeros[contadora];
		}
		System.out.println("A soma dos elementos é " + soma);
	}

}