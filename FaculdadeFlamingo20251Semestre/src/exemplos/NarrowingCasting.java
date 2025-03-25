package exemplos;

public class NarrowingCasting {

	public static void main(String[] args) {
		
		double numero =  150.35d;
		short numero2 = (short) numero;
		
		System.out.println("O numero é: " +numero);
		System.out.println("O numero agora é : " +numero2);
		
	}
}
