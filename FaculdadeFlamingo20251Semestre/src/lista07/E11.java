package lista07;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String resposta;
        double areaTotal = 0;

        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = sc.nextLine();

            System.out.print("Digite a largura do(a) " + nomeComodo + " (em metros): ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do(a) " + nomeComodo + " (em metros): ");
            double comprimento = sc.nextDouble();
            sc.nextLine(); 

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("Área do(a) %s: %.2f m²%n", nomeComodo, areaComodo);

            System.out.print("Deseja adicionar outro cômodo? (Digite 'NAO' para encerrar): ");
            resposta = sc.nextLine().trim().toUpperCase();

            if (resposta.equals("NAO")) {
                break;
            }
        }

        System.out.printf("Área total da residência: %.2f m²%n", areaTotal);
        sc.close();
    }
}
