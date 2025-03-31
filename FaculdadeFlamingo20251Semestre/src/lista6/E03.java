package lista6;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Sistema de Calciladora : ");
		System.out.println("Digite o primeiro valor : ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor : ");
		int numero2 = sc.nextInt();
		System.out.println("Digite a operação que deseja efetuar : ");
		char operacao = sc.next().charAt(0);
		float resultado;
		switch (operacao) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println("O resultado da soma é : ");
			break;
		case '-':
			resultado = numero1 + numero2;
			System.out.println("O resultado da subtração é : ");
			break;
		case '*':
			resultado = numero1 + numero2;
			System.out.println("O resultado da multiplicação é : ");
			break;
		case '/':
			resultado = numero1 + numero2;
			System.out.println("O resultado da divisão é : ");
			break;
		default:
			System.out.println("Operação invalida");
			break;
			
		}
		sc.close();
	}

}
