package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
   public static void main(String[] args) {
       ArrayList<Integer> lista = new ArrayList<>();

       lista.add(10);
       lista.add(20);
       lista.add(30);
       lista.add(40);

       for(int i=0; i<lista.size(); i++) {
           System.out.println(lista.get(i));
       }

       lista.remove(2); // remove o valor do indice 2

       for (Integer valor : lista) { // atalho: foreach - para cada 'valor' da lista faça
        System.out.println(valor);
       }
   } 
}
