package nivel2.ex024_matriz_quadrada_simetrica;

import java.util.Scanner;

public class MatrizQuadradaSimetrica {

    /* Posição dos elementos em 3x3
    [00] [01] [02]
    [10] [11] [12]
    [20] [21] [22]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Verificador de Matriz Quadrada Simétrica ====\n");

        // 1. Perguntar o tamanho da matriz
        System.out.print("Informe o tamanho da matriz (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        // 2. Ler os elementos da matriz
        System.out.println("\nDigite os elementos da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // 3. Mostra a matriz digitada
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Verificar se é simétrica
        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // só compara acima da diagonal
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break; // para e sai do loop de comparação
                }
            }
            if (!simetrica) break;
        }

        // 5. Mostrar resultado
        System.out.println("\n==== Resultado ====");
        if (simetrica) {
            System.out.println("A matriz é SIMÉTRICA!");
        } else {
            System.out.println("A matriz NÃO é simétrica!");
        }
        scanner.close();
    }
}
