package lista3;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Digite o lado do Quadrado:" );
		 int lado = sc.nextInt();
		 
		 int soma = lado * lado;
		 
		 System.out.println("Area do quadrado é: " + soma);
		 
		 sc.close();
	}

}