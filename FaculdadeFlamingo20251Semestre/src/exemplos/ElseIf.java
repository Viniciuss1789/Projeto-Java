package exemplos;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade : ");
		int idade = sc.nextInt();
		
		if (idade < 16) {
			System.out.println("Não pode Votar");
		}
		
		else if (idade <= 18) {
			System.out.println("Você pode Votar");
		}
		
		else {
			System.out.println("Você tem que votar");
		}
		
		sc.close();
	}

}
