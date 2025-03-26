package exemplos;

import java.util.Scanner;

public class MesesDoAnoSwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleciona um Mês do Ano : ");
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
		System.out.println("Julho");
		System.out.println("Agosto");
		System.out.println("Setembro");
		System.out.println("Outubro");
		System.out.println("Novembro");
		System.out.println("Dezembro");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Hoje é Janeiro");
			break;
		case 2:
			System.out.println("Hoje é Fevereiro");
			break;
		case 3:
			System.out.println("Hoje é Março");
			break;
		case 4:
			System.out.println("Hoje é Abril");
			break;
		case 5:
			System.out.println("Hoje é Maio");
			break;
		case 6:
			System.out.println("Hoje é Junho");
			break;
		case 7:
			System.out.println("Hoje é Julho");
			break;
		case 8:
			System.out.println("Hoje é Agosto");
			break;
		case 9:
			System.out.println("Hoje é Setembro");
			break;
		case 10:
			System.out.println("Hoje é Outubro");
			break;
		case 11:
			System.out.println("Hoje é Novembro");
			break;
		case 12:
			System.out.println("Hoje é Dezembro");
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
	}

}