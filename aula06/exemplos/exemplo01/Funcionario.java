package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome){
        this.nome=nome;
        this.salario=0;
    }

    public Funcionario(String nome,double salario) {
        this.nome=nome;
        this.salario=salario;
    }

    public String imprimir() {
        return nome + ": " + salario;
    }

    public void aumentoSalario(double perc) {
        salario = salario + salario*perc;
    }

    @Override
    public String toString() {
        return nome + ": " + salario;
    }
    
}