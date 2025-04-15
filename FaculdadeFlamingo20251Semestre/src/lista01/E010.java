package lista01;

import java.util.Scanner;

public class E010 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo :");
		float raio = sc.nextFloat();
		float perimetro = 2*3.14f*raio;
		System.out.println("O valor do perimetro é :"+perimetro);
		System.out.printf("O valor do perimetro é : %.2r",perimetro);
		sc.close();
	}

}
