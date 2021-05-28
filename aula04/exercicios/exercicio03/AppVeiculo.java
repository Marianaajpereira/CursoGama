package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Honda", "Fit", 12);

        v.infosCarro();
        System.out.printf("CONSUMO: %.1f km/l\n", v.consumoCarro());
    }
}
