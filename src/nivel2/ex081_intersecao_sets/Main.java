package nivel2.ex081_intersecao_sets;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> linguagensA =
                new HashSet<>(Set.of("Java", "Go", "Typescript", "C#"));

        Set<String> linguagensB =
                new HashSet<>(Set.of("Python", "JavaScript", "Java", "Go"));

        Set<String> intercessao = linguagensA.stream()
                .filter(linguagensB::contains)
                .collect(Collectors.toSet());

        System.out.println(intercessao);
    }
}
