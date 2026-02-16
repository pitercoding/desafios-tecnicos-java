package nivel2.ex054_bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int numero : array) {
            System.out.println(numero + " ");
        }
    }
}
