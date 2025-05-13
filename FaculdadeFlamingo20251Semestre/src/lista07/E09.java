package lista07;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int soma = 0;

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
            contador++;
        }

        double media = (double) soma / 10;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média aritmética: " + media);

        sc.close();
    }
}
