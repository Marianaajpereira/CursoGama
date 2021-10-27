package exercicios.exercicio03.modelo;

public class ContaCorrente extends Conta {

    private final double Taxa_deposito = 0.1;
    
    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= getSaldo()) {
            return super.sacar(valor);
        }
    return false; // sem saldo suficiente
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - Taxa_deposito);
    }
}
