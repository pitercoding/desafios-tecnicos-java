package nivel2.ex080_union_sets;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> uniao = Stream.concat(setA.stream(), setB.stream())
                .collect(Collectors.toSet());

        System.out.println(uniao);
    }
}
