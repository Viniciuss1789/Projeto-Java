package lista02;

import java.util.Scanner;

public class E07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a da equação quadratica :");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o valor de b da equação quadratica :");
		double numero2 = sc.nextDouble();
		System.out.println("Digite o valor de c da equação quadratica :");
		float numero3 = sc.nextFloat();
		
		sc.close();
		
		double delta = Math.pow(numero2, 2.0) - 4*numero1*numero3;
		System.out.println(delta);
		if (delta>0) {}
		else if (delta == 0) {}

	}

}
