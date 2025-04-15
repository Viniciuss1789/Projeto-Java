package lista02;

import java.util.Scanner;

public class E02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de Juros Compostos.");
		System.out.println("Digite qual é o valor inicial: ");
		float capital = sc.nextFloat();
		System.out.println("Digite a taxa de juros por período: ");
		float taxajuros = sc.nextFloat();
		System.out.println("Digite por quantos meses você pretende aplicar o valor: ");
		float meses = sc.nextFloat();
		float taxaetapa = 1 + (taxajuros / 100);
		float periodo = (float) Math.pow(taxaetapa, meses);
		float montante = capital * periodo;
		System.out.println("O montante final é: " + montante + ".");
		sc.close();
	}
}