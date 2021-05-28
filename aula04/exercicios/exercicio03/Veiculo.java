package exercicios.exercicio03;

public class Veiculo {
    // atributos
    private String modelo,  marca;
    private double consumo;

    // metodos
    public Veiculo(String marca, String modelo, double consumo) { //construtor
        this.modelo = modelo; // this se refere ao atributo
        this.marca = marca;
        alterarConsumo(consumo);
    }

    public void infosCarro() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
    }

    public double consumoCarro() {
        return consumo;
    }

    public void alterarConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
