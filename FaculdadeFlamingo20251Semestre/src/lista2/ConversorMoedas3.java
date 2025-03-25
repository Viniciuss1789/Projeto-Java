package lista2;

import java.util.Scanner;

public class ConversorMoedas3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de Moedas");
		
		System.out.println("Digite o valor que deseja converter : ");
		float real =sc.nextFloat();
		float dollar = 5.800f ;
		float euro = 6.294f ;
		float libra = 7.512f ;
		
		float conversorDollar = real/dollar;
		float conversorEuro = real/euro;
		float conversorLibra = real/libra;
		
		System.out.printf("O valor convertido em dollar é : US$%f\n",conversorDollar);
		System.out.printf("O valor convertido em euro é : EUR%f\n",conversorEuro);
		System.out.printf("O valor convertido em libra é : GBP%f\n",conversorLibra);
		sc.close();
		
	}

}
