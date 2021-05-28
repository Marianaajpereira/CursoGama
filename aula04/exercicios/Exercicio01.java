package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();
        
        if(ePar(valor)==0) {
            System.out.printf("O numero %d e PAR.", valor);
        } else {
            System.out.printf("O numero %d e IMPAR.", valor);
        }

        entrada.close();
    }

    static int ePar(int n1) {
        int resposta;
        resposta = n1%2;
        return resposta;
    }
}
