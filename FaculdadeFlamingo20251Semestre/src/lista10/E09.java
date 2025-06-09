package lista10;

import java.util.Scanner;

public class E09{
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int valor;

        do {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            valor = sc.nextInt();

            if (valor >= 0) {
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }

        } while (valor >= 0);

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        sc.close();
    }
}
