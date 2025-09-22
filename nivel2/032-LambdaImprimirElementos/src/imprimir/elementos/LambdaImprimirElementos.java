package imprimir.elementos;

import java.util.Arrays;
import java.util.List;

public class LambdaImprimirElementos {
    public static void main(String[] args) {
        List<Integer> listaDeInteiros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listaDeInteiros.forEach(n -> System.out.println(n));
    }
}
