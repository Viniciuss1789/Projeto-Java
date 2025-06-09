package lista10;

public class E04 {

	public static void main(String[] args) {
		double graos = 1;
		double total = 0;
		int casa = 1;

		do {
			total += graos;
			graos *= 2;
			casa++;
		} while (casa <= 64);

		System.out.println("Total de grãos no tabuleiro: " + total);
	}
}
