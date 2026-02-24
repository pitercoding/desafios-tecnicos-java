package nivel2.ex057_somar_matrizes;

public class SomaMatrizes {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int linhas = A.length;
        int colunas = A[0].length;

        // Verificação de dimensão
        if (linhas != B.length || colunas != B[0].length) {
            System.out.println("As matrizes não têm a mesma dimensão.");
            return;
        }

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }

        // Imprimir resultado
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
