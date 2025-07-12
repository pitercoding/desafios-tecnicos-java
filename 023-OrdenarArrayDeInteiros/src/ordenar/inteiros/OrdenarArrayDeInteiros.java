package ordenar.inteiros;

import java.util.Scanner;

public class OrdenarArrayDeInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números inteiros separados por espaço:");
        String[] entrada = scanner.nextLine().split(" ");
        int[] numeros = new int[entrada.length];

        // Convertendo os valores para inteiros
        for (int i = 0; i < entrada.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        // Algoritmo Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Trocar os elementos
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        /*
        // Resolução mais simples com Arrays.sort() ao invés do Algoritmo Bubble Sort
        Arrays.sort(numeros);
         */

        // Exibindo o array ordenado
        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

/**
 * Leitura da entrada do usuário via Scanner.
 * Conversão para int[].
 * Ordenação manual usando o algoritmo Bubble Sort.
 * Exibição dos números já ordenados.
 */
