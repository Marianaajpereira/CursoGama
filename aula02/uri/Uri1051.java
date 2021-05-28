package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valor, imposto;

        valor = entrada.nextDouble();

        if (valor > 4500) {
            imposto = (valor - 4500) * 0.28 + (4500 - 3000.01) * 0.18 + (3000 - 2000.01) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            if (valor <= 4500 && valor > 3000) {
                imposto = (valor - 3000.01) * 0.18 + (3000 - 2000.01) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            } else {
                if (valor <= 3000 && valor > 2000) {
                    imposto = (valor - 2000.01) * 0.08;
                    System.out.printf("R$ %.2f\n", imposto);
                } else {
                    System.out.println("Isento");
                }
            }
        }

        entrada.close();
    }
}
