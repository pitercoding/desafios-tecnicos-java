package impares;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNumerosImpares {
    public static void main(String[] args) {

        //Array aleatório de números entre 1 a 100
        int tamanho = 10;
        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1; // Gera número de 1 a 100
        }

        System.out.println("======== NÚMEROS ÍMPARES ========");

        ArrayList<Integer> impares = new ArrayList<>();

        int contadorImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contadorImpares++;
                impares.add(numero);
            }
        }

        System.out.println("Array aleatório: " + Arrays.toString(numeros));
        System.out.println("Quantidade: " + contadorImpares);
        System.out.println("Ímpares: " + impares);
    }
}
