package lista04;

import java.util.Scanner;

public class E04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O número é negativo ou positivo");
		
		int numero = sc.nextInt();
		
		if (numero >0) {
			System.out.println("O número " +numero+ " é positivo ");
		}else if (numero <0) {
			System.out.println("O número " +numero+ " é negativo ");
		}else {
			System.out.println("O número é zero");
		}
		
		sc.close();
	}

}
