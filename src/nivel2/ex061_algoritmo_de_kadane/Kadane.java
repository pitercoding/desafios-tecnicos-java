package nivel2.ex061_algoritmo_de_kadane;

public class Kadane {
    public static void main(String[] args) {
        int[] meuArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Soma máxima: " + maxSubarraySum(meuArray));
    }

    private static int maxSubarraySum(int[] numeros) {
        int maxAtual = numeros[0];
        int maxGlobal = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            maxAtual = Math.max(numeros[i], maxAtual + numeros[i]);
            maxGlobal = Math.max(maxGlobal, maxAtual);

            System.out.println("i=" + i +
                    " valor=" + numeros[i] +
                    " maxAtual=" + maxAtual +
                    " maxGlobal=" + maxGlobal);
        }

        return maxGlobal;
    }
}
