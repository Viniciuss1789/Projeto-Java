package lista02;

import java.util.Scanner;

public class E05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de Média Harmônica.");
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		
		if (valor1 == 0 || valor2 == 0 || valor3 == 0) {
            System.out.println("Não é possível calcular a média harmônica com valor(es) zero.");
        } else {
            double valores = (1.0 / valor1) + (1.0 / valor2) + (1.0 / valor3);
            double harmonica = 3.0 / valores;
            System.out.println("A média harmônica desses valores é: " + harmonica + ".");
        }
		sc.close();
	}

}
