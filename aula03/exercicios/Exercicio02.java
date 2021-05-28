package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, cont;

        System.out.println("Digite o numero: ");
        valor = entrada.nextInt();

        cont = 0;
        while (cont<=10) {
            System.out.printf("%2d x %2d = %2d\n", valor, cont, (valor*cont));
            cont++;
        }
        entrada.close();
    }
}
