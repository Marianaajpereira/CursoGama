package uri;

import java.util.Scanner;

public class Uri1010 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int peca1, peca2, qnt1, qnt2;
        double valor1, valor2, total;

        peca1 = entrada.nextInt();
        qnt1 = entrada.nextInt();
        valor1 = entrada.nextDouble();
        peca2 = entrada.nextInt();
        qnt2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        total = qnt1*valor1 + qnt2*valor2;

        System.out.println("PRODUTOS: " + peca1 + ", " + peca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        entrada.close();

    }
}
