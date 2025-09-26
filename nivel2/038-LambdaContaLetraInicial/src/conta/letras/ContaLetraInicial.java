package conta.letras;

import java.util.Arrays;
import java.util.List;

public class ContaLetraInicial {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Amor", "Sol", "Avião", "Lua", "Amizade", "Estrela");

        long quantidade = palavras.stream()
                .filter(p -> p.startsWith("A"))
                .count();

        System.out.println("Quantidade de palavras que começam com 'A': " + quantidade);
    }
}
