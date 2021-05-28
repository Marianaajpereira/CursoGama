package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio reg = new Relogio(13,26,56);

        System.out.println(reg.getHora());
        System.out.println(reg.getMin());
        System.out.println(reg.getSeg());
        System.out.println("Hora atual: " + reg.horaAtual());
    }
}
