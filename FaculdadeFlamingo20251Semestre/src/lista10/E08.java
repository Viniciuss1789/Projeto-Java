package lista10;

import java.util.Scanner;

public class E08 {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nome = sc.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = sc.nextDouble();
            sc.nextLine();

            double area = largura * comprimento;
            areaTotal += area;

            System.out.println("Área do " + nome + ": " + area + " m²");

            System.out.print("Deseja continuar (SIM/NAO)? ");
            resposta = sc.nextLine().toUpperCase();

        } while (!resposta.equals("NAO"));

        System.out.println("Área total da residência: " + areaTotal + " m²");
        sc.close();
    }
}
