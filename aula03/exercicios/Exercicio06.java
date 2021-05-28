package exercicios;

import java.util.Scanner;

public class Exercicio06 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int valor, soma, contPar, contImpar;
       double media;
       
       valor=1;
       soma=0;
       contPar=0;
       contImpar=0;

       for(int num=1; num<=10; num++) {
        System.out.printf("Digite o %d numero: ", num, valor);
           valor = entrada.nextInt();
           if(valor%2==0) {
               soma = soma + valor;
               contPar = contPar + 1;
           } else {
            contImpar = contImpar + 1;
           }
       }

       media = soma / contPar;

       System.out.printf("Media dos valores pares: %.1f\n", media);
       System.out.printf("Percentual de valores impares: %d%%\n", contImpar*10);

       entrada.close();
   } 
}
