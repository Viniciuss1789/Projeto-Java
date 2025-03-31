package lista6;

import java.util.Scanner;

public class E05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idades");
		System.out.println("Bebe");
		System.out.println("Criança");
		System.out.println("Adolencente");
		System.out.println("Adulto");
		System.out.println("Idoso");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 0,1,2,3,4:
			System.out.println("É Bebe");
			break;
		case 5,6,7,8,9,10,11,12:
			System.out.println("É Criança");
			break;
		case 13,14,15,16,17,18,19,20,21,22,23,24,25:
			System.out.println("É Adolecente");
			break;
		case 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
			System.out.println("É Adulto");
			break;
		case 60:
			System.out.println("É Idoso");
			break;
		default:
			System.out.println("Está morto");
			break;
		}
		
		sc.close();
	}

}
