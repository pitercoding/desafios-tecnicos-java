package imprimir.cinco.numeros.inteiros;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImprimirCincoNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elementos = new int[5]; // Criando array

        // Preenchendo o array com os números informados pelo usuário
        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número inteiro: ");

            // Enquanto não for um inteiro válido, continue pedindo
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida! Digite o " + (i + 1) + "° número inteiro: ");
                scanner.next(); // descarta a entrada inválida
            }
            elementos[i] = scanner.nextInt(); // Armazena se inteiro válido
        }
        scanner.close();

        // Exibindo os números armazenados no array
        System.out.println("\nNúmeros informados: " + Arrays.toString(elementos));
    }
}
