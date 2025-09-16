package pares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elementos = new int[10];

        System.out.println("========= NÚMEROS PARES =========");
        System.out.println("Informe 10 valores inteiros.");

        // Preenchendo o array com os números informados pelo usuário
        for (int i = 0; i < elementos.length; i++) {
            System.out.print((i + 1) + "º valor: ");

            // Enquanto não for um inteiro válido, continue pedindo
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida! Digite o " + (i + 1) + "° valor: ");
                scanner.next(); // descarta a entrada inválida
            }
            elementos[i] = scanner.nextInt(); // Armazena se o valor for inteiro
        }
        scanner.close();

        // Exibindo os números armazenados no array
        System.out.println("\nValores informados: " + Arrays.toString(elementos));

        // Criando ArrayList de valores pares
        ArrayList<Integer> pares = new ArrayList<>();

        // Verificando números pares e adicionando no ArrayList
        for (int numero : elementos){
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        // Exibindo somente os valores pares do array original
        System.out.println("Valores pares: " + pares);
    }
}
