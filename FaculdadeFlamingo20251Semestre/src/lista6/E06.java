package lista6;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = sc.nextDouble();
        
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = sc.nextDouble();
        
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = sc.nextDouble();

        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os lados de um triângulo devem ser positivos.");
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        
        sc.close();
    }
}
