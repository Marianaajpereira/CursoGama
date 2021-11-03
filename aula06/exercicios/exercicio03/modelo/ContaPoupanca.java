package exercicios.exercicio03.modelo;

public class ContaPoupanca extends Conta {
    private static double taxa = 0.1; // atributo da classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxa(double taxa) { // pode ser chamado sem criar um objeto
        ContaPoupanca.taxa = taxa; // se fosse objeto seria this.taxa
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor + taxa){
            return super.sacar(valor + taxa);
        }
        return false;        
    }

    @Override
    public String toString() {

        return super.toString() + " - Taxa:" + taxa;
    }
    
}
