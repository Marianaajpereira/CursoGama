package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, nota3, media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        media = (2*nota1 + 3*nota2 + 5*nota3) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();

    }
}
