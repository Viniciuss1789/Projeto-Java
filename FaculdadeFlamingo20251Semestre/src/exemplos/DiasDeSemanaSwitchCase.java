package exemplos;

import java.util.Scanner;

public class DiasDeSemanaSwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleciona o dia da Semana : ");
		System.out.println("Domingo");
		System.out.println("Segunda");
		System.out.println("Terça");
		System.out.println("Quarta");
		System.out.println("Quinta");
		System.out.println("Sexta");
		System.out.println("Sabádo");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Hoje é Domingo");
			break;
		case 2:
			System.out.println("Hoje é Segunda");
			break;
		case 3:
			System.out.println("Hoje é Terça");
			break;
		case 4:
			System.out.println("Hoje é Quarta");
			break;
		case 5:
			System.out.println("Hoje é Quinta");
			break;
		case 6:
			System.out.println("Hoje é Sexta");
			break;
		case 7:
			System.out.println("Hoje é Sabádo");
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
	}

}
