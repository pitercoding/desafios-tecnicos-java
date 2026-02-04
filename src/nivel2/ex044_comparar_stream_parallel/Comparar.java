package nivel2.ex044_comparar_stream_parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.function.Supplier;

public class Comparar {

    private static long measureMillis(Supplier<Long> supplier) {
        long start = System.nanoTime();
        long result = supplier.get(); // garante que o cálculo não seja removido
        long end = System.nanoTime();
        System.out.println("Resultado (soma): " + result);
        return (end - start) / 1_000_000; // retorna em ms
    }

    public static void main(String[] args) {
        final int N = 1_000_000;
        System.out.println("Preparando dados: somar 1.." + N);

        // Lista com boxing (List<Integer>) — simula uso comum de coleções
        List<Integer> numerosBoxed = IntStream.rangeClosed(1, N)
                .boxed()
                .collect(Collectors.toList());

        // Warm-up (ajuda o JIT a otimizar antes das medições)
        System.out.println("Warm-up...");
        for (int i = 0; i < 3; i++) {
            LongStream.rangeClosed(1, N).sum();
            LongStream.rangeClosed(1, N).parallel().sum();
            numerosBoxed.stream().mapToLong(Integer::longValue).sum();
            numerosBoxed.parallelStream().mapToLong(Integer::longValue).sum();
        }

        final int runs = 5;
        long totalBoxedSeq = 0, totalBoxedPar = 0, totalPrimSeq = 0, totalPrimPar = 0;

        System.out.println("Executando medições (" + runs + " runs)...");
        for (int i = 1; i <= runs; i++) {
            System.out.println("\n--- Run " + i + " ---");

            long tBoxedSeq = measureMillis(() -> numerosBoxed.stream()
                    .mapToLong(Integer::longValue).sum());
            long tBoxedPar = measureMillis(() -> numerosBoxed.parallelStream()
                    .mapToLong(Integer::longValue).sum());
            long tPrimSeq = measureMillis(() -> LongStream.rangeClosed(1, N).sum());
            long tPrimPar = measureMillis(() -> LongStream.rangeClosed(1, N).parallel().sum());

            System.out.printf("Tempos (ms) -> Boxed seq: %d, Boxed par: %d, Prim seq: %d, Prim par: %d%n",
                    tBoxedSeq, tBoxedPar, tPrimSeq, tPrimPar);

            totalBoxedSeq += tBoxedSeq;
            totalBoxedPar += tBoxedPar;
            totalPrimSeq += tPrimSeq;
            totalPrimPar += tPrimPar;
        }

        System.out.println("\n=== MÉDIAS (ms) ===");
        System.out.printf("Boxed stream (List<Integer>.stream()): %.2f ms%n", totalBoxedSeq / (double) runs);
        System.out.printf("Boxed parallelStream (List<Integer>.parallelStream()): %.2f ms%n", totalBoxedPar / (double) runs);
        System.out.printf("Primitive LongStream (sequential): %.2f ms%n", totalPrimSeq / (double) runs);
        System.out.printf("Primitive LongStream (parallel): %.2f ms%n", totalPrimPar / (double) runs);

        System.out.println("\nObservações:");
        System.out.println("- Resultados variam conforme número de núcleos, carga do sistema e JVM.");
        System.out.println("- Boxing (List<Integer>) adiciona overhead; comparações com LongStream são mais justas.");
        System.out.println("- Para benchmarking sério, use JMH (Java Microbenchmark Harness).");
    }
}
