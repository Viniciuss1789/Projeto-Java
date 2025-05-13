package lista07;

public class E10 {

	public static void main(String[] args) {
		int numero = 50;
		int soma = 0;
		int contador = 0;

		while (numero <= 70) {
			if (numero % 2 == 0) {
				soma += numero;
				contador++;
			}
			numero++;
		}

		double media = (double) soma / contador;

		System.out.println("Soma dos números pares entre 50 e 70: " + soma);
		System.out.println("Média aritmética: " + media);
	}
}
