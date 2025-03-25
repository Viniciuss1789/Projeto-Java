package exemplos;

public class RealLife {

	public static void main(String[] args) {
		
		//Declaração da Variavel
		
		int itens = 50;
		float precoPorItens = 9.99f;
		float precoTotal = itens * precoPorItens;
		char moeda = '$';
		
		System.out.println("Quantidade de Itens: " + itens);
		System.out.println("Preço do Item: " + precoPorItens + moeda);
		System.out.println("Total: " + precoTotal + moeda);
	}
}