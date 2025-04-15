package lista04;

import java.util.Scanner;

public class E03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sua nota final");
		
		int nota = sc.nextInt();
		
		if (nota >=60 ) {
			System.out.println("Parabens você foi aprovado");
		}else {
			System.out.println("Infelizmente você não foi aprovado");
		}
		
		sc.close();
	}
	

}
