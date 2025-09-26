package filtrarstrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarStringsMais5Caracteres {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("exemplo", "casa", "aviao", "programacao", "java", "stream", "filtro");

        List<String> resultado = palavras.stream()
                .filter(s -> s.trim().length() > 5)
                .collect(Collectors.toList());

        System.out.printf("Lista original: " + palavras);
        System.out.printf("\nLista com mais de 5 caracteres: " + resultado);
    }
}
