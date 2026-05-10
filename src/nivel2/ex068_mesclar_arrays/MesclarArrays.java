package nivel2.ex068_mesclar_arrays;

import java.util.Arrays;

public class MesclarArrays {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] resultado = mesclar(array1, array2);

        System.out.println(Arrays.toString(resultado));
    }

    private static int[] mesclar(int[] a, int[] b) {
        int[] resultado = new int[a.length +b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k] = a[i];
                i++;
            } else {
                resultado[k] = b[j];
                j++;
            }
            k++;
        }

        // elementos restantes do array A
        while (i < a.length) {
            resultado[k] = a[i];
            i++;
            k++;
        }

        // elementos restantes do array B
        while (j < b.length) {
            resultado[k] = b[j];
            j++;
            k++;
        }

        return resultado;
    }
}
