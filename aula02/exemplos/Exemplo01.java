package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        // printf([FORMATO], [VALORES]/[VARIAVEIS]);
        System.out.println("A resposta e " + 10);
        System.out.printf("A resposta e %d\n", 10);

        // FORMATOS:
        // %d = int
        // %f = decimal
        // %s = string
        // %x.yf (x = numero de casas inteiras, y = numero de casas decimais)

        System.out.printf("A media e: %1f", 12.67243);
    }
}