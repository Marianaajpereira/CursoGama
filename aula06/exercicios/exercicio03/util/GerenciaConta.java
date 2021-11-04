package exercicios.exercicio03.util;

import java.util.ArrayList;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class GerenciaConta {
    private ArrayList<Conta> contas;

    public GerenciaConta() {
        contas = new ArrayList<>();
    }

    public void novaContaCorr(int numeroConta) {
    /*  ContaCorrente cc;
        cc = new ContaCorrente(numeroConta);
        conta.add(cc); */
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspec(int numeroConta, double limite){
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoup(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if(numeroConta == conta.getNumero()) {
                return conta.sacar(valor);
            }
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if(numeroConta == conta.getNumero()) {
                return conta.depositar(valor);
            }
        }
        return false;
    }

    public String getSaldo(int numeroConta){
        for (Conta conta : contas) {
            if(numeroConta == conta.getNumero()) {
                return conta.toString();
            }
        }
        return "Conta nao encontrada";
    }

    public Conta getConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return new Conta(conta.getNumero(), conta.getSaldo());
            }
        }
        return null;
    }

    public boolean remover(int numeroConta){
        for (Conta conta : contas) {
            if(numeroConta == conta.getNumero()) {
                return contas.remove(conta);
            }
        }
        return false;
    }
}
