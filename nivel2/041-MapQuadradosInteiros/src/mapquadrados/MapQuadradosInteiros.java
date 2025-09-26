package mapquadrados;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapQuadradosInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2,4,6,8,10);

        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.printf("Lista original: " + numeros);
        System.out.printf("\nLista dos quadrados: " + quadrados);
    }
}
