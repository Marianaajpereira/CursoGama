package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, soma, media;
        int valorPositivo;
        
        valor=1;
        valorPositivo=0;
        soma=0;

        for(int i=1; i<=6; i++) {
            valor = entrada.nextDouble();
            if(valor>0) {
                valorPositivo = valorPositivo + 1;
                soma = soma + valor;
            }
        }

        media = soma/valorPositivo;
        System.out.printf("%d valores positivos\n", valorPositivo);
        System.out.printf("%.1f\n", media);
        entrada.close();
    }
}
