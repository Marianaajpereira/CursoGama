package exercicios.exercicio03;
import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.util.GerenciaConta;

// App com a classe GerenciaConta

public class AppConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu, numeroConta;
        double valor, limite;

        GerenciaConta contas = new GerenciaConta();
        
        do {
            System.out.print("\033[H\033[2J"); // limpa tela
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupanca");
            System.out.println("4 - Saque");
            System.out.println("5 - Deposito");
            System.out.println("6 - Saldo");
            System.out.println("7 - Remover conta");
            System.out.println("8 - Sair");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorr(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o lmite da conta: ");
                    limite = entrada.nextDouble();
                    contas.novaContaEspec(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoup(numeroConta);
                    break;
                case 4:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Valor do saque: ");
                    valor = entrada.nextDouble();
                    if(contas.sacar(numeroConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Valor do deposito: ");
                    valor = entrada.nextDouble();
                    if(contas.depositar(numeroConta, valor)) {
                        System.out.println("Deposito realizado.");
                    } else {
                        System.out.println("Falha na operacao.");
                    }
                    break;
                case 6:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    Conta conta = contas.getConta(numeroConta);
                    if(conta !=  null){
                        System.out.println(conta);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 7:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    if(contas.remover(numeroConta)) {
                        System.out.println("Conta removida.");
                    } else {
                    System.out.println("Conta nao encontrada");
                    }
                    break;
                case 8:
                    break;
                default: // caso contrario
                    System.out.println("Opcao invalida");    
            }
            System.out.println("ENTER para confirmar...");
            entrada.nextLine();
            entrada.nextLine();
        } while (menu != 8);

        entrada.close();

    }
}
