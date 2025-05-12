package lista07;

public class E05 {

	public static void main(String[] args) {
		int expoente = 0;
		int base = 3;

		while (expoente <= 15) {
			int resultado = 1;
			int contador = 0;

			while (contador < expoente) {
				resultado *= base;
				contador++;
			}

			System.out.println(base + " ^ " + expoente + " = " + resultado);
			expoente++;
		}
	}
}
