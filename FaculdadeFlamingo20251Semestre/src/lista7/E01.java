package lista7;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite um número para saber a tabuada ate 10");
		 int numero = sc.nextInt();
		 int contadora = 0;
		 
		while (contadora <=10) {
			System.out.println(numero+ "X" +contadora+ "=" +(numero*contadora));
			contadora++;
		}
		
		sc.close();
	}

}
