package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxa = 0.1;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo()+taxa >= valor){
            return super.sacar(valor + taxa);
        }
        return false;        
    }

    @Override
    public String toString() {

        return super.toString() + " - Taxa:" + taxa;
    }
    
}
