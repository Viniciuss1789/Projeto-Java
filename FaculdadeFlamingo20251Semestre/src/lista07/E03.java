package lista07;

public class E03 {
	
	public static void main(String[] args) {
		int numero = 1;
		int soma = 0;

		while (numero <= 500) {
			if (numero % 2 == 0) {
				soma += numero;
			}
			numero++;
		}

		System.out.println("A soma dos números pares de 1 até 500 é: " + soma);
	}
}
