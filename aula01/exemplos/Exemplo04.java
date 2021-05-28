package exemplos;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero, dobro;

        /* ENTRADA */
        System.out.print("Digite um numero inteiro: ");
        numero = entrada.nextInt(); // lendo um numero inteiro do teclado e guardando na variavel 'numero'

        /* PROCESSAMENTO */
        dobro = numero * 2;

        /* SAIDA */
        System.out.println("Voce digitou " +  numero);
        System.out.println("O dobro e " +  dobro);

        entrada.close();
    }
}
