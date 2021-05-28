package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Informe as notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = nota1*0.4 + nota2*0.6;

        System.out.printf("MEDIA = %.1f\n", media);

        if(media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Fim do programa.");

        entrada.close();
    }
}
