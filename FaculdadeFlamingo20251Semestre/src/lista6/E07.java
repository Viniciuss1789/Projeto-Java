package lista6;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite um número de 1 a 12 para saber o mês e a estação do ano: ");
        int mes = sc.nextInt();

        
        if (mes >= 1 && mes <= 12) {
            
            switch (mes) {
                case 1:
                    System.out.println("Mês: Janeiro");
                    System.out.println("Estação: Verão");
                    break;
                case 2:
                    System.out.println("Mês: Fevereiro");
                    System.out.println("Estação: Verão");
                    break;
                case 3:
                    System.out.println("Mês: Março");
                    System.out.println("Estação: Outono");
                    break;
                case 4:
                    System.out.println("Mês: Abril");
                    System.out.println("Estação: Outono");
                    break;
                case 5:
                    System.out.println("Mês: Maio");
                    System.out.println("Estação: Outono");
                    break;
                case 6:
                    System.out.println("Mês: Junho");
                    System.out.println("Estação: Inverno");
                    break;
                case 7:
                    System.out.println("Mês: Julho");
                    System.out.println("Estação: Inverno");
                    break;
                case 8:
                    System.out.println("Mês: Agosto");
                    System.out.println("Estação: Inverno");
                    break;
                case 9:
                    System.out.println("Mês: Setembro");
                    System.out.println("Estação: Primavera");
                    break;
                case 10:
                    System.out.println("Mês: Outubro");
                    System.out.println("Estação: Primavera");
                    break;
                case 11:
                    System.out.println("Mês: Novembro");
                    System.out.println("Estação: Primavera");
                    break;
                case 12:
                    System.out.println("Mês: Dezembro");
                    System.out.println("Estação: Verão");
                    break;
            }
        } else {
            System.out.println("Número inválido! Por favor, digite um número de 1 a 12.");
        }

        
        sc.close();
    }
}
