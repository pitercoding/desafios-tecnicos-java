package nivel2.ex088_subconjunto_arraylist;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaA = List.of(1, 2, 3);
        List<Integer> listaB = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean resultado = new HashSet<>(listaB).containsAll(new HashSet<>(listaA));
        System.out.println("A é subconjunto de B? " + resultado);
    }
}
