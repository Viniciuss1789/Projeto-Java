package exemplos;

import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu Nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o seu Sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.println("Digite o seu idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite o seu ID: ");
		int id = sc.nextInt();
		System.out.println("Digite o seu CPF: ");
		String cpf = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite o seu Periodo: ");
		String periodo = sc.nextLine();
		System.out.println("Digite o seu Turma: ");
		String turma = sc.nextLine();	
		System.out.println("Digite o seu Andar: ");
		String andar = sc.nextLine();
		System.out.println("Digite o seu Media: ");
		float media = sc.nextFloat();
		
		System.out.println("O Nome do aluno(a) é : " +nome);
		System.out.println("O Sobrenome do aluno(a) é : " +sobrenome);
		System.out.println("Qual a idade do aluno(a) é : " +idade);
		System.out.println("Qual o ID do aluno(a) é : " +id);
		System.out.println("Qual o CPF do aluno(a) é : " +cpf);
		System.out.println("Qual o Periodo do aluno(a) é : " +periodo);
		System.out.println("Qual a Turma do aluno(a) é : " +turma);
		System.out.println("Qual o andar do aluno(a) é : " +andar);
		System.out.println("Qual a Média do aluno(a) é : " +media);

		sc.close();
	}

}
