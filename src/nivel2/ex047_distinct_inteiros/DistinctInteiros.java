package nivel2.ex047_distinct_inteiros;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctInteiros {
    public static void main(String[] args) {

        // 1) Usando Stream.distinct()
        List<Integer> numeros = Arrays.asList(1,1,2,3,4,5,6,6,7,7,8,8,9,9,9,10);
        List<Integer> unicos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original: " + numeros);
        System.out.println("Únicos (stream.distinct): " + unicos);

        // 2) Alternativa one-pass usando LinkedHashSet (preserva ordem)
        Set<Integer> setUnicos = new LinkedHashSet<>(numeros);
        List<Integer> unicosOnePass = new ArrayList<>(setUnicos);
        System.out.println("Únicos (LinkedHashSet one-pass): " + unicosOnePass);
    }
}
