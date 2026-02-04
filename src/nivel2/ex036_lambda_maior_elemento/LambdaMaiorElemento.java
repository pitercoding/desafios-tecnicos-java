package nivel2.ex036_lambda_maior_elemento;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaMaiorElemento {
    public static void main(String[] args) {
        List<Integer> listaDeElementos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> maior = listaDeElementos.stream()
                .max((a, b) -> Integer.compare(a, b));
        maior.ifPresent(m -> System.out.println("Maior presente: " + m));
    }
}
