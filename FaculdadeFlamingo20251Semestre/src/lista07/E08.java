package lista07;

public class E08 {

	public static void main(String[] args) {
		int celsius = 10;

		System.out.println("Celsius\tFahrenheit");
		System.out.println("---------------------");

		while (celsius <= 100) {
			double fahrenheit = (9.0 / 5.0) * celsius + 32;
			System.out.println(celsius + "\t" + fahrenheit);
			celsius += 10;
		}
	}
}
