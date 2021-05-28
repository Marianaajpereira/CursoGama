package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, valor, soma;

        cont = 1;
        soma = 0;
        valor = 1;

        while(valor!=0) {
            System.out.printf("Digite o %d numero: ", cont, valor);
            valor = entrada.nextInt();

            soma = soma + valor;
            cont++;
        }

        System.out.printf("A soma dos valores e: %d\n", soma);
        entrada.close();
    }
}
