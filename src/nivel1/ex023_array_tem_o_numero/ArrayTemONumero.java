package nivel1.ex023_array_tem_o_numero;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTemONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Verifique se um número foi sorteado (Escolha entre 1 a 50): ");
        int[] numerosaleatorios = new int[20];

        for (int i = 0; i < numerosaleatorios.length; i++) {
            numerosaleatorios[i] = (int) (Math.random() * 50 ) + 1;
        }

        int palpite = scanner.nextInt();
        boolean existe = Arrays.stream(numerosaleatorios).anyMatch(n -> n == palpite);

        if (existe) {
            System.out.println("O número " + palpite + " foi encontrado no array!");
        } else {
            System.out.println("\nO número não foi encontrado!");
        }

        System.out.println("Números sorteados: " + Arrays.toString(numerosaleatorios));
    }

}
