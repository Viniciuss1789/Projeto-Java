package lista1;

import java.util.Scanner;

public class Multiplicacao03 {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);

	
	System.out.println("Digite um número : ");
	int numero1 =sc.nextInt();
	System.out.println("Digite um número : ");
	int numero2 =sc.nextInt();
	int resultado = numero1*numero2;
	System.out.println("A multiplicação dos valores é : "+resultado);
	sc.close();
}
}