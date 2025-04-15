package lista1;

import java.util.Scanner;

public class E06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor que deseja saber o quadrado :");
		int numero = sc.nextInt();
		int resultado = numero*numero;
		System.out.println("O valor do quadrado do número digitado é : "+resultado);
		sc.close();
	}
}
