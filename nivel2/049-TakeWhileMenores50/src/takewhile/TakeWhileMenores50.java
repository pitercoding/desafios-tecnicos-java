package takewhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMenores50 {
    public static void main(String[] args) {
        // Exemplo 1: primeiros elementos menores que 50, depois aparecendo >=50
        List<Integer> lista1 = Arrays.asList(10, 20, 30, 49, 50, 40, 25);

        // Exemplo 2: há um elemento >=50 no meio (takeWhile para antes dele)
        List<Integer> lista2 = Arrays.asList(5, 15, 60, 10, 20, 30);

        // Exemplo 3: todos menores que 50
        List<Integer> lista3 = Arrays.asList(1, 2, 3);

        // Usando takeWhile (em cada caso)
        List<Integer> resultado1 = lista1.stream()
                .takeWhile(n -> n < 50)
                .collect(Collectors.toList());

        List<Integer> resultado2 = lista2.stream()
                .takeWhile(n -> n < 50)
                .collect(Collectors.toList());

        List<Integer> resultado3 = lista3.stream()
                .takeWhile(n -> n < 50)
                .collect(Collectors.toList());

        System.out.println("Lista1: " + lista1);
        System.out.println("takeWhile (<50) -> " + resultado1);
        // Observação: 50 interrompe a sequência, então 40 e 25 depois não são incluídos

        System.out.println("\nLista2: " + lista2);
        System.out.println("takeWhile (<50) -> " + resultado2);
        // 60 interrompe; elementos após 60 (10,20,30) não são considerados

        System.out.println("\nLista3: " + lista3);
        System.out.println("takeWhile (<50) -> " + resultado3);

        // Nesse caso melhor opção é usar .filter() ou ordenar a lista (Collections.sort(lista1);) e depois usar o takeWhile()
        System.out.println("\nComparação (filter):");
        System.out.println("lista1.filter(<50) -> " + lista1.stream().filter(n -> n < 50).collect(Collectors.toList()));
        System.out.println("lista2.filter(<50) -> " + lista2.stream().filter(n -> n < 50).collect(Collectors.toList()));
    }
}
