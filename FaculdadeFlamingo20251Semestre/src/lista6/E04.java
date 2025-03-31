package lista6;

import java.util.Scanner;

public class E04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Estações do Ano");
		System.out.println("1 - Verão");
		System.out.println("2 - Outono");
		System.out.println("3 - Inverno");
		System.out.println("4 - Primavera");
		System.out.println("Selecione uma opção válida");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("A estação do ano é Verão");
			break;
		case 2:
			System.out.println("A estação do ano é Outono");
			break;
		case 3:
			System.out.println("A estação do ano é Inverno");
			break;
		case 4:
			System.out.println("A estação do ano é Primavera");
			break;
		default:
			System.out.println("Não existe estação com esse número");
			break;
		}
		sc.close();
	}

}
