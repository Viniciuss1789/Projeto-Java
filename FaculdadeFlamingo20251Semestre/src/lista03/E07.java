package lista03;

import java.util.Scanner;

public class E07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("Digite a quantidade de anos: ");
	    int anos = sc.nextInt();
	        
	    System.out.print("Digite a quantidade de meses: ");
	    int meses = sc.nextInt();
	        
	    System.out.print("Digite a quantidade de dias: ");
	    int dias = sc.nextInt();

	    int idadeEmDias = anos * 365 + meses * 30 + dias;

	    System.out.println("A idade da pessoa em dias é: " + idadeEmDias);

	    sc.close();
	    }
	}
