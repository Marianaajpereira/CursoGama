package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, contPar, contImpar, contP, contN;
        valor=1;
        contPar=0;
        contImpar=0;
        contP=0;
        contN=0;
        
        for(int i=1; i<=5; i++) {

            valor = entrada.nextInt();

            if(valor%2==0){
                contPar = contPar+1;
            } else {
                contImpar = contImpar+1;
            }

            if(valor>0){
                contP = contP+1;
            } else {
                if(valor<0){
                    contN = contN+1;
                }
            }
        }

        System.out.printf("%d valor(es) par(es)\n", contPar);
        System.out.printf("%d valor(es) impar(es)\n", contImpar);
        System.out.printf("%d valor(es) positivo(s)\n", contP);
        System.out.printf("%d valor(es) negativo(s)\n", contN);
        entrada.close();
    }
}
