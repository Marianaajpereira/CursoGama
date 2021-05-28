package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, media;

        /* ENTRADAS */
        System.out.println("Primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = entrada.nextDouble();

        /* PROCESSAMENTO */
        media = (nota1 + nota2) / 2;

        /* SAIDA */
        System.out.println("A media e: " + media);

        entrada.close();

    }
}
