package exemplos;

public class Cafe {
	static String meuCafe(String id, String produto, String preco, String marca, String modelo, String peso) {
		return id + produto + preco + marca + modelo + peso;
	}

	public static void main(String[] args) {
		System.out.println(meuCafe("1 ", " Café ", " R$:52,34 ", " Pilão ", " Torrado e Moído Tradicional", " 500g"));
	}

}
