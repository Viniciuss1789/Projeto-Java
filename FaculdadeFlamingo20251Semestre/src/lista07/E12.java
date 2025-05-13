package lista07;

import java.util.Scanner;

public class E12 {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores positivos. Para encerrar, digite um valor negativo.");

        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        }

        sc.close();
    }
}
