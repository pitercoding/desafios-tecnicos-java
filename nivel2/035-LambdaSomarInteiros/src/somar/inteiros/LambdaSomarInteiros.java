package somar.inteiros;

import java.util.Arrays;
import java.util.List;

public class LambdaSomarInteiros {
    public static void main(String[] args) {
        List<Integer> listaDeInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(listaDeInteiros.stream()
                .reduce(0, (a,b) -> a + b));
    }
}
