package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.print("Informe o Salario: R$");
        salario = entrada.nextDouble();
        System.out.print("Informe a Prestacao: R$");
        prestacao = entrada.nextDouble();

        if(prestacao <= 0.3*salario) {
            System.out.println("Emprestimo pode ser concedido.");
        } else {
            System.out.println("Emprestimo nao pode ser concedido, prestacao ultrapassa 30% do salario bruto.");
        }

        entrada.close();
    }
}
