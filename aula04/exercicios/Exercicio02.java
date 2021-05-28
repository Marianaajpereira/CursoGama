package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.print("Digite o 1 valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Digite o 2 valor: ");
        valor2 = entrada.nextInt();
        System.out.print("Digite o 3 valor: ");
        valor3 = entrada.nextInt();

        System.out.println("O menor valor e: " + eMenor(valor1, valor2, valor3));

        entrada.close();
    }

    static int eMenor(int n1, int n2, int n3) {
        if(n1 <= n2 && n1 <=n3) {
            return n1;
        } else {
            if(n2 <= n1 && n2 <=n3) {
                return n2;
            } else {
                return n3;
            }
        } 
    }
}
