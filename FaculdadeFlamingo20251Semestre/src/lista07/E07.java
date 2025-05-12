package lista07;

public class E07 {

	public static void main(String[] args) {
		int termo1 = 1;
		int termo2 = 1;
		int contador = 3;

		System.out.print("Série de Fibonacci até o 15º termo: ");
		System.out.print(termo1 + ", " + termo2);

		while (contador <= 15) {
			int proximoTermo = termo1 + termo2;
			System.out.print(", " + proximoTermo);

			termo1 = termo2;
			termo2 = proximoTermo;
			contador++;
		}
	}
}
