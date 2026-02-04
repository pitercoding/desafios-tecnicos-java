package nivel2.ex025_rotacionar_array;

import java.util.Arrays;
import java.util.Scanner;

public class RotacionarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("==== Rotacionador de Array ====");
        System.out.println("Array inicial: " + Arrays.toString(numeros));

        System.out.print("Quantas rotações deseja fazer? ");
        int k = scanner.nextInt();

        System.out.print("Digite 'E' para esquerda ou 'D' para direita: ");
        String direcao = scanner.next().trim().toUpperCase();

        k = k % numeros.length; // Otimização: não precisa rotacionar mais que o tamanho do array

        if (direcao.equals("E")) {
            rotacionarEsquerda(numeros, k);
        } else if (direcao.equals("D")) {
            rotacionarDireita(numeros, k);
        } else {
            System.out.println("Direção inválida!");
            scanner.close();
            return;
        }

        System.out.println("Array após rotação: " + Arrays.toString(numeros));

        scanner.close();
    }

    // Rotacionar para a esquerda k vezes
    private static void rotacionarEsquerda(int[] arr, int k) {
        for (int r = 0; r < k; r++) {
            int primeiro = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = primeiro;
        }
    }

    // Rotacionar para a direita k vezes
    private static void rotacionarDireita(int[] arr, int k) {
        for (int r = 0; r < k; r++) {
            int ultimo = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = ultimo;
        }
    }
}