package lista4;

import java.util.Scanner;

public class E01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O valor inteiro?");
		
		int imparoupar = sc.nextInt();

		
		if (imparoupar % 2 == 0) {
			System.out.println("O número é " + imparoupar + " Par");
		}else {
			System.out.println("O número é " + imparoupar + " Impar");
		}
		
		sc.close();
		
	}

}
