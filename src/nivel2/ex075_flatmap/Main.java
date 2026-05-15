package nivel2.ex075_flatmap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> listas = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9),
                List.of(10, 11, 12)
        );

        List<Integer> numeros = listas.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(numeros);
    }
}
