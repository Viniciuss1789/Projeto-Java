package exemplos;

public class JavaMethods04 {
	
	public static void exibirComputador(String marcaComputador, String modeloComputador, float precoComputador) {
		
		System.out.println("A marca do computador é: " + marcaComputador);
		System.out.println("O modelo do computador é: " + modeloComputador);
		System.out.println("O preço do computador é: " + precoComputador);
	}
	
	public static void main(String[] args) {
		
		exibirComputador("AMD" , "5600GT" , 2069.00f);
	}

}
