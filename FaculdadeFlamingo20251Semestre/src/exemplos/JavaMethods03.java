package exemplos;

public class JavaMethods03 {

	public static void exibirDados(String nome, int idade, String CEP) {
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CEP: " + CEP);
		
	}
	
	public static void main(String[] args) {
		
		exibirDados("Douglas", 25, "12345-678");
	}

}
