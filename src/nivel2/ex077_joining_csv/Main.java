package nivel2.ex077_joining_csv;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of(
                "Racha Cuca",
                "Poucas Trancas",
                "Quase Nada",
                "Tripa Seca"
        );

        String csv = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(csv);
    }
}
