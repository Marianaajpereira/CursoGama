package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cont, nota, soma, media;

        nota=0;
        cont=0;
        soma=0;

        while(cont<2) {
            nota = entrada.nextDouble();
            if(nota>=0 && nota<=10) {
                soma = soma + nota;
                cont++;
            } else {
                System.out.println("nota invalida");
            }
        }
        media = soma/2;
        System.out.printf("media = %.2f\n", media);

        entrada.close();
    }
}
