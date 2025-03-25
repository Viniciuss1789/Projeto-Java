package exemplos;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade : ");
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Não pode consumir bebida alcoólica!");
		}

		else if (idade > 18) {
			System.out.println("Sim pode consumir bebida alcoólica!");
		}
	
			sc.close();
	}

}
