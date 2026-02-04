package nivel1.ex024_array_inverter_ordem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayInverterOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida! Digite o " + (i + 1) + "° número inteiro: ");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Array Original: " + Arrays.toString(numeros));

        Collections.reverse(Arrays.asList(numeros));
        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }
}
