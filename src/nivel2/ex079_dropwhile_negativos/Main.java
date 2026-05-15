package nivel2.ex079_dropwhile_negativos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, -4, 5, 6);

        List<Integer> resultado = numeros.stream()
                .dropWhile(n -> n > 0)
                .toList();

        System.out.println(resultado);
    }
}
