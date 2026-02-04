package nivel2.ex033_lambda_somente_pares;

import java.util.Arrays;
import java.util.List;

public class LambdaSomentePares {
    public static void main(String[] args) {
        List<Integer> listaDeInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listaDeInteiros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
