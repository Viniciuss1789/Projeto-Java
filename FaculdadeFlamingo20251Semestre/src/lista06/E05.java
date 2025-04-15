package lista06;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Categoria: Criança");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Categoria: Adolescente");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Categoria: Adulto");
		} else if (idade >= 60 && idade <= 90) {
			System.out.println("Categoria: Idoso");
		} else {
			System.out.println("Idade inválida!");
		}

		sc.close();
	}
}
