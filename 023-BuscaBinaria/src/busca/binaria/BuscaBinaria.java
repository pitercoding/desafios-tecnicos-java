package busca.binaria;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = lerNumero(scanner, "Digite o número de elementos do array: ");

        int[] array = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = lerNumero(scanner, "Digite o " + (i + 1) + "° elemento: ");
        }

        Arrays.sort(array);
        System.out.println("Array em ordem crescente: " + Arrays.toString(array));

        int elementoAlvo = lerNumero(scanner, "\nDigite o elemento alvo: ");

        int indiceEncontrado = Arrays.binarySearch(array, elementoAlvo);

        if (indiceEncontrado >= 0) {
            System.out.println("Elemento encontrado na posição (índice): " + indiceEncontrado);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }

        scanner.close();
    }

    // 🔹 Método auxiliar para ler somente números inteiros
    public static int lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida! Digite apenas números: ");
            scanner.next(); // descarta a entrada inválida
        }
        return scanner.nextInt();
    }
}