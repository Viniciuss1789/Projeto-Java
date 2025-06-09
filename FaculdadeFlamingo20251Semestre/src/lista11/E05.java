package lista11;

import java.util.Scanner;

public class E05 {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é " + fatorial);
        sc.close();
    }
}
