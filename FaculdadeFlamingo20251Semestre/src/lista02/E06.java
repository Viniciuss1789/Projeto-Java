package lista02;

import java.util.Scanner;

public class E06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° Valor");
		double numero1 = sc.nextDouble();
		System.out.println("Digite o 2° Valor");
		double numero2 = sc.nextDouble();
		System.out.println("Digite o 3° Valor");
		double numero3 = sc.nextDouble();
		
		double mediaGeometrica = Math.cbrt(numero1*numero2*numero3);
		
		System.out.println("A média geometrica desses valores é: " + mediaGeometrica );
		
		sc.close();
	}

}
