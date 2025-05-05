package lista03;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário fixo do vendedor: R$ ");
		double salarioFixo = sc.nextDouble();

		System.out.print("Digite o número de carros vendidos: ");
		int carrosVendidos = sc.nextInt();

		System.out.print("Digite o valor total das vendas: R$ ");
		double totalVendas = sc.nextDouble();

		System.out.print("Digite o valor recebido por carro vendido: R$ ");
		double comissaoPorCarro = sc.nextDouble();

		double comissaoTotal = carrosVendidos * comissaoPorCarro;
		double bonusVendas = totalVendas * 0.05;
		double salarioFinal = salarioFixo + comissaoTotal + bonusVendas;

		System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

		sc.close();
	}
}
