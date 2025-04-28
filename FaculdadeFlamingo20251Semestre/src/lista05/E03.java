package lista05;

import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu peso em kg: ");
		double peso = sc.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		double altura = sc.nextDouble();

		double imc = calcularIMC(peso, altura);

		System.out.println("Seu IMC é: " + String.format("%.2f", imc));

		String classificacao = classificarIMC(imc);
		System.out.println("Classificação: " + classificacao);

		sc.close();
	}

	public static double calcularIMC(double peso, double altura) {
		return peso / (altura * altura);
	}

	public static String classificarIMC(double imc) {
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc >= 18.5 && imc < 24.9) {
			return "Peso normal";
		} else if (imc >= 25 && imc < 29.9) {
			return "Sobrepeso";
		} else if (imc >= 30 && imc < 34.9) {
			return "Obesidade grau 1";
		} else if (imc >= 35 && imc < 39.9) {
			return "Obesidade grau 2";
		} else {
			return "Obesidade grau 3 (obesidade mórbida)";
		}
	}
}