package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu, numeroConta;
        ContaCorrente cc = null;

        System.out.print("\033[H\033[2J"); // limpa tela

        do {
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupanca");
            System.out.println("4 - Saque");
            System.out.println("5 - Deposito");
            System.out.println("6 - Saldo");
            System.out.println("7 - Sair");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Informe o numero da conta:");
                numeroConta = entrada.nextInt();
                cc = new ContaCorrente(numeroConta);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                System.out.println(cc);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (menu != 7);

        entrada.close();

    }
}
