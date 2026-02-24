package nivel2.ex056_transpor_matriz;

public class TransporMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transporta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transporta[j][i] = matriz[i][j];
            }
        }

        for (int[] linha : transporta) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
