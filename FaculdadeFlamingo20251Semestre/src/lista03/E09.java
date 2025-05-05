package lista03;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário atual do funcionário: ");
		double salarioAtual = sc.nextDouble();

		System.out.print("Digite o percentual de reajuste (%): ");
		double percentualReajuste = sc.nextDouble();

		double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

		System.out.printf("O novo salário com reajuste é: R$ %.2f\n", novoSalario);

		sc.close();
	}
}
