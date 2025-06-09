package lista09;

import java.util.Scanner;

public class E08 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        do {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            palavra = sc.nextLine().toLowerCase();

            if (!palavra.equals("sair")) {
                int contador = 0;
                int i = 0;

                while (i < palavra.length()) {
                    char letra = palavra.charAt(i);
                    if ("aeiou".indexOf(letra) != -1) {
                        contador++;
                    }
                    i++;
                }

                System.out.println("Número de vogais na palavra: " + contador);
            }
        } while (!palavra.equals("sair"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
