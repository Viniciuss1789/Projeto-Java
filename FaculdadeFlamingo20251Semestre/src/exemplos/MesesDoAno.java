package exemplos;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número correspondente a um Mês do Ano : ");
		int mesdoAno = sc.nextInt();
		
		if (mesdoAno == 1) {
			System.out.println("Janeiro");
		}
		else if (mesdoAno == 2) {
			System.out.println("Fevereiro");
		}
		else if (mesdoAno == 3) {
			System.out.println("Março");
		}
		else if (mesdoAno == 4) {
			System.out.println("Abril");
		}
		else if (mesdoAno == 5) {
			System.out.println("Maio");
		}
		else if (mesdoAno == 6) {
			System.out.println("Junho");
		}
		else if (mesdoAno == 7) {
			System.out.println("Julho");
		}
		else if (mesdoAno == 8) {
			System.out.println("Agosto");
		}
		else if (mesdoAno == 9) {
			System.out.println("Setembro");
		}
		else if (mesdoAno == 10) {
			System.out.println("Outubro");
		}
		else if (mesdoAno == 11) {
			System.out.println("Novembro");
		}
		else if (mesdoAno == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("Não há um mês correspondente");
		}
		
		sc.close();
		

	}

}