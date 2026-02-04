package nivel2.ex046_min_max_nomes_por_tamanho;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxNomesPorTamanho {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Beatriz", "Carlos", "João", "Felipe", "Z");

        // Comparator: primeiro por tamanho, depois por ordem lexicográfica (para desempate)
        Comparator<String> lengthThenLex = Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder());

        Optional<String> menor = nomes.stream().min(lengthThenLex);
        Optional<String> maior = nomes.stream().max(lengthThenLex);

        System.out.println("Lista: " + nomes);

        menor.ifPresentOrElse(
                s -> System.out.println("Menor: " + s + " (tamanho= " + s.length() + ")"),
                () -> System.out.println("Lista vazia — nenhum menor.")
        );

        maior.ifPresentOrElse(
                s -> System.out.println("Maior: " + s + " (tamanho= " + s.length() + ")"),
                () -> System.out.println("Lista vazia — nenhum maior.")
        );
    }
}
