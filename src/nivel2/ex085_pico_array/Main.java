package nivel2.ex085_pico_array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int pico = encontrarPico(arr);

        System.out.println("Pico: " + pico);
    }

    private static int encontrarPico(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
}
