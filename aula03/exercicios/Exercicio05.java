package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, pares, impares;

        valor = 1;
        pares = 0;
        impares = 0;

        for (int cont=1; cont<=10; cont++) {
            System.out.printf("Digite o %d numero: ", cont, valor);
            valor = entrada.nextInt();

            if(valor%2==0) {
                pares = pares + 1;
            } else {
                impares = impares +1;
            }
        }

        System.out.printf("O total de pares e: %d\n", pares);
        System.out.printf("O total de impares e: %d\n", impares);
        entrada.close();
    }
}
