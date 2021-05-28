package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Double distancia, litros, consumo;

        distancia = entrada.nextDouble();
        litros = entrada.nextDouble();

        consumo = distancia / litros;

        System.out.printf("%.3f km/l\n", consumo);

        entrada.close();
    }
}
