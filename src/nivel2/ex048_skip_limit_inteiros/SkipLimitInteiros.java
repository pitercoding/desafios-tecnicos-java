package nivel2.ex048_skip_limit_inteiros;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SkipLimitInteiros {
    public static void main(String[] args) {
        // Exemplo: números de 1 a 30
        List<Integer> numeros = IntStream.rangeClosed(1,30)
                .boxed()
                .collect(Collectors.toList());

        // Pular os 5 primeiros e pegar os 10 seguintes
        List<Integer> resultado = numeros.stream()
                .skip(5) // pula 1,2,3,4,5
                .limit(10) // pega os próximos 10 (6..15)
                .collect(Collectors.toList());

        System.out.println("Lista original: " + numeros);
        System.out.println("Resultado (skip 5, limit 10): " + resultado);
    }
}
