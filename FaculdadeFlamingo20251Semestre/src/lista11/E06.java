package lista11;

public class E06 {

	public static void main(String[] args) {
		int a = 0, b = 1;

		System.out.println("Primeiros 10 números da sequência de Fibonacci:");
		for (int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
