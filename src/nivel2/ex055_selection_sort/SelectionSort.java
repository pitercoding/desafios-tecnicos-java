package nivel2.ex055_selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        for (int i = 0; i < array.length - 1; i++) {

            int menorIndice = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }

            // Troca
            int temp = array[i];
            array[i] = array[menorIndice];
            array[menorIndice] = temp;
        }

        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
}
