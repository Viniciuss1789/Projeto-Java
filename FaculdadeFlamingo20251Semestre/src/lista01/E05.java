package lista01;

import java.util.Scanner;

public class E05 {
public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite um número : ");
	float numero1 =sc.nextFloat();
	System.out.println("Digite um número : ");
	float numero2 =sc.nextFloat();
	float resto = numero1%numero2;
	float resultado = numero1/numero2;
	System.out.printf("A divisão dos valores é : %.2f",resultado);
	System.out.println("O resto da divisão é "+resto);
	sc.close();
}
}