package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, cont;

        System.out.print("Digite o valor maximo: ");
        N = entrada.nextInt();

        cont=1;
        
        while (cont<=N) {
            System.out.print(cont);
            cont = cont * 2;
            if(cont<=N) {
                System.out.print(", ");
            }
        }

        entrada.close();
    }
}
