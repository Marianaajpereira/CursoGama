package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Mariana", 20000);
        Funcionario f2 = new Funcionario("Manuela");
        Gerente g = new Gerente("Joao", 25000, 15);

        f.aumentoSalario(0.1);
        f2.aumentoSalario(0.1);
        g.aumentoSalario(0.1);

        System.out.println(f.imprimir());
        System.out.println(f2.imprimir());
        System.out.println(g.imprimir());

        System.out.println(f);
        System.out.println(g);
    }
}
