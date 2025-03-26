package lista3;

import java.util.Scanner;

public class E02 {
  
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = sc.nextInt();
		
		int sucessor = valor + 1;
		
		System.out.println("O sucessor de " + valor + " é " + sucessor);
		
		sc.close();
	}
}