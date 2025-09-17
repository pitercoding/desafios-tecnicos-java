package negativos;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySomenteNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosInformados = new int[10];

        for (int i = 0; i < numerosInformados.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            numerosInformados[i] = scanner.nextInt();
        }
        int[] somenteNegativos = Arrays.stream(numerosInformados).filter(n -> n < 0).toArray();
        System.out.println("Array de negativos: " + Arrays.toString(somenteNegativos));
    }
}
