package lista03;

import java.util.Scanner;

public class E03 {
   
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
	    double altura = sc.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do retângulo é: " + area );
		
		sc.close();
	}
	
}