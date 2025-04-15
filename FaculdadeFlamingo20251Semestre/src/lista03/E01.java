package lista03;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Digite um número: ");
        int valor = sc.nextInt();

      
        int antecessor = valor - 1;

       
        System.out.println("O antecessor de " + valor + " é " + antecessor + ".");

        sc.close();
    }
}