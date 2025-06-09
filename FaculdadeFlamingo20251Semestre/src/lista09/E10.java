package lista09;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senhaCorreta = "java123";
		String senhaDigitada;

		do {
			System.out.print("Digite a senha: ");
			senhaDigitada = sc.nextLine();

			if (!senhaDigitada.equals(senhaCorreta)) {
				System.out.println("Senha incorreta. Tente novamente.");
			}
		} while (!senhaDigitada.equals(senhaCorreta));

		System.out.println("Acesso concedido!");
		sc.close();
	}
}
