package lista10;

public class E03 {

	public static void main(String[] args) {
		int num = 1;
		do {
			if (num % 4 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num < 200);
	}
}
