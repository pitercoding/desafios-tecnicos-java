package pares;

public class Pares1A100 {
    public static void main(String[] args) {

        /**
         * Use um for ou while para imprimir todos os números pares entre 1 e 100.
         */

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
