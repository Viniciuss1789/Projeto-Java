package lista10;

public class E02 {

	public static void main(String[] args) {
		int num = 1;
		int soma = 0;
		do {
			if (num % 2 == 0) {
				soma += num;
			}
			num++;
		} while (num <= 500);

		System.out.println("Soma dos pares de 1 a 500: " + soma);
	}
}
