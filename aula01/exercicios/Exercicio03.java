package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        double salario, novoSalario;

        System.out.print("Informe o salario atual: R$");
        salario = entrada.nextDouble();

        novoSalario = salario * 1.25;

        System.out.print("O noso salario e R$" + novoSalario);

        entrada.close();
    }
}
