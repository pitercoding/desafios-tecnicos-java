package nivel2.ex051_array_elementos_comuns;

import java.util.HashSet;
import java.util.Set;

public class ElementosComuns {
    public static void main(String[] args) {
        Set<Integer> numeros1 = Set.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> numeros2 = Set.of(1,2,3,14,15,16,17,18,19,10);
        Set<Integer> numerosComuns = new HashSet<>();

        for (int numero : numeros2) {
            if (numeros1.contains(numero)) {
                numerosComuns.add(numero);
            }
        }
        System.out.println("Elementos comuns: " + numerosComuns);
    }
}
