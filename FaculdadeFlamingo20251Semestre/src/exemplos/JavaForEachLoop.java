package exemplos;

import java.util.Scanner;

public class JavaForEachLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] dbs = {"Goku", "Vegeta", "Gohan", "Trunks"};
		for (String contadora : dbs) {
			System.out.println(contadora);
		}
		sc.close();
	}

}
