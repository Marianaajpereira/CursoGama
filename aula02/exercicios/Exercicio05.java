package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.print("Informe o salario: R$");
        salario = entrada.nextDouble();

        if(salario <= 600.00) {
            System.out.println("Isento");
        } else {
            if(salario <= 1200) {
                System.out.println("Desconto de 20%");
            } else {
                if(salario <= 2000) {
                    System.out.println("Desconto de 25%");
                } else {
                    System.out.println("Desconto de 30%");
                }
            }
        }

        entrada.close();
    }
}
