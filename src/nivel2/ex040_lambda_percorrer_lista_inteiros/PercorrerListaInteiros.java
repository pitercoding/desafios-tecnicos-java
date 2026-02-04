package nivel2.ex040_lambda_percorrer_lista_inteiros;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PercorrerListaInteiros {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1,2,3,4,5,6,7,8,9, 10);

        // Parte 1: Usando Iterator
        System.out.println("Percorrendo com Interator: ");
        Iterator<Integer> iterator = inteiros.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }

        // Parte 2: Usando Stream
        System.out.println("\nPercorrendo com Stream:");
        inteiros.stream().forEach(System.out::println);
    }
}
