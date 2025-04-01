package exemplos;

import java.util.Scanner;

public class JavaMath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");

		int numero1 = sc.nextInt();

		System.out.println("Digite um valor");

		int numero2 = sc.nextInt();

		System.out.println("Digite um valor");

		int numeroRaiz = sc.nextInt();

		System.out.println("Digite um valor negativo");

		int numeroAbsoluto = sc.nextInt();

		int numeroRandom = (int)(Math.random() * 101);

		System.out.println("O maior número digita é : " + Math.max(numero1, numero2));
		System.out.println("O menor número digita é : " + Math.min(numero1, numero2));
		System.out.println("O valor da raiz quadrada digita é : " + Math.sqrt(numeroRaiz));
		System.out.println("O valor absoluto do valor é : " + Math.abs(numeroAbsoluto));
		System.out.println("Aqui um valor aleatório : " + Math.random());
		System.out.println("O valor random de 0 a 100 é : " + (numeroRandom));

		sc.close();
	}

}
