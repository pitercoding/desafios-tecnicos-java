package verificarmatch;

import java.util.*;

public class VerificarMatchInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 3, 14, -5, 9);

        // 1) Todos positivos, algum par, nenhum múltiplo de 7
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        boolean algumPar = numeros.stream().anyMatch(n -> n % 2 == 0);
        boolean nenhumMultiplo7 = numeros.stream().noneMatch(n -> n % 7 == 0);

        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> multiplosDe7 = new ArrayList<>();

        for (Integer n : numeros){
            if (n == null) continue;

            // positivos e negativos
            if (n > 0) { positivos.add(n); } else { negativos.add(n); }

            // pares e ímpares
            if (n % 2 == 0) { pares.add(n); } else { impares.add(n); }

            // múltiplos de 7
            if (n % 7 == 0) { multiplosDe7.add(n); }
        }

        System.out.println("Lista: " + numeros);

        System.out.println("\n--- allMatch ---");
        System.out.println("Todos positivos? " + todosPositivos);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        System.out.println("\n--- anyMatch ---");
        System.out.println("Algum é par? " + algumPar);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        System.out.println("\n--- noneMatch ---");
        System.out.println("Nenhum é múltiplo de 7? " + nenhumMultiplo7);
        System.out.println("Múltiplos de 7: " + multiplosDe7);
    }
}