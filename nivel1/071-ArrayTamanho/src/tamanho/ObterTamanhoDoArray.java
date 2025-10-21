package tamanho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObterTamanhoDoArray {
    public static void main(String[] args) {
        // Exemplo 1: array de inteiros
        int[] numeros = {1, 2, 3, 4, 5, 6};
        System.out.println("Array de inteiros: " + java.util.Arrays.toString(numeros));
        System.out.println("Tamanho: " + numeros.length);

        // Exemplo 2: array de Strings
        String[] nomes = {"Ana", "Beatriz", "Carlos"};
        System.out.println("\nArray de Strings: " + java.util.Arrays.toString(nomes));
        System.out.println("Tamanho: " + nomes.length);

        // Exemplo 3: array vazio
        double[] vazios = {};
        System.out.println("\nArray vazio: " + java.util.Arrays.toString(vazios));
        System.out.println("Tamanho: " + vazios.length);
    }
}
