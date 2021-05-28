package exemplos;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Informe a idade: ");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Voce ja pode dirigir.");
        }

        System.out.println("Fim do programa.");

        entrada.close();

    }
    
}
