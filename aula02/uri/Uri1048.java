package uri;

import java.util.Scanner;

public class Uri1048 {
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);

    double salario, novoSalario, reajuste;
    int indice;

    salario = entrada.nextDouble();

    if(salario>=0 && salario<=400) {
        indice = 15;
    } else {
        if(salario>400 && salario<=800) {
            indice = 12;
        } else {
            if(salario>800 && salario<=1200) {
                indice = 10;
            } else {
                if(salario>1200 && salario<=2000) {
                    indice = 7;
                } else {
                    indice = 4;
                }
            }
        }
    }

    reajuste = salario*indice/100;
    novoSalario = salario + reajuste;

    System.out.printf("Novo salario: %.2f\n", novoSalario);
    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    System.out.printf("Em percentual: %d %%\n", indice, "%");

    entrada.close();
  }  
}
