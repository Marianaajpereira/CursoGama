package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextDouble();

        if (numero > 20) {
            System.out.printf("A metade e %.1f\n",  numero/2);
        }

        System.out.println("Fim do programa.");

        entrada.close();
    }
}
