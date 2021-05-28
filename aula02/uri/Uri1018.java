package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int Inseridas, N, notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        Inseridas = entrada.nextInt();

        notas100 = Inseridas / 100;
        N = Inseridas % 100;
        notas50 = N / 50;
        N = N % 50;
        notas20 = N / 20;
        N = N % 20;
        notas10 = N / 10;
        N = N % 10;
        notas5 =N / 5;
        N = N % 5;
        notas2 = N / 2;
        N = N % 2;
        notas1 = N;

        System.out.println(Inseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        entrada.close();
    }
}
