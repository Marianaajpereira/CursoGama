package exercicios.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu, numeroConta;
        double valor, limite;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        ArrayList<Conta> contas = new ArrayList<>();
        
        do {
            System.out.print("\033[H\033[2J"); // limpa tela
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
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o lmite da conta: ");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    contas.add(ce);
                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    contas.add(cp);
                    break;
                case 4:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Valor do saque: ");
                    valor = entrada.nextDouble();
                    for (Conta conta : contas) {
                        if(numeroConta == conta.getNumero()) {
                            if(conta.sacar(valor)) {
                              System.out.println("Saque realizado.");
                      } else {
                               System.out.println("Saldo insuficiente.");
                      }
                         break;
                      }
                  }
                  break;
                case 5:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Valor do deposito: ");
                    valor = entrada.nextDouble();
                    for (Conta conta : contas) {
                        if(numeroConta == conta.getNumero()) {
                         if(conta.depositar(valor)) {
                            System.out.println("Deposito realizado.");
                          } else {
                               System.out.println("Falha na operacao.");
                         }
                         break;
                     }
                 }
                 break;
                case 6:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    for (Conta conta : contas) {
                        if(numeroConta == conta.getNumero()) {
                            System.out.println(conta);
                            break;
                        }
                    }
                    break;
                case 7:
                    break;
                default: // caso contrario
                    System.out.println("Opcao invalida");    
            }
            System.out.println("ENTER para confirmar...");
            entrada.nextLine();
            entrada.nextLine();
        } while (menu != 7);

        entrada.close();

    }
}
