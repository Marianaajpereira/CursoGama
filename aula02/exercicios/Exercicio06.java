package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int a, b, c;

            System.out.println("Informe os lados do triangulo:");
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = entrada.nextInt();

            if(a <= b+c && b <= a+c && c <= a+b) {
                if(a==b && b==c) {
                    System.out.println("Triangulo equilatero");
                } else {
                    if(a==b || b==c || a==c) {
                        System.out.println("Triantulo isosceles");
                    } else {
                        System.out.println("Triantulo escaleno");
                    }
                }
            } else {
                System.out.println("Nao e um triangulo.");
            }

            entrada.close();
    }
}
