package exemplos;

import java.util.Scanner;

public class Exemplo003 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       char resp; //declara a variavel de controle
       int num, acmNum=0;
       resp='s'; //inicializa a variavel de controle

       while(resp=='s' || resp=='S') {
           System.out.println("Digite um numero: ");
           num = entrada.nextInt();

           acmNum = acmNum + num;

           System.out.println("Deseja continuar?(s/n):");
           resp = entrada.next().charAt(0); //Modifica a variavel de controle
       }

       System.out.println("Soma dos valores: " + acmNum);
       entrada.close();
   } 
}
