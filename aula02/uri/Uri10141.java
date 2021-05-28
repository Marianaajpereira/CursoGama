package uri;

import java.util.Scanner;

public class Uri10141 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X;
        double Y;

        X = entrada.nextInt();
        Y = entrada.nextDouble();

        System.out.printf("%.3f km/l\n", X/Y);

        entrada.close();
    }
}
