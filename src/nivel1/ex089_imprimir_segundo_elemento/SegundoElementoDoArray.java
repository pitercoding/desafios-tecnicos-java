package nivel1.ex089_imprimir_segundo_elemento;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoElementoDoArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int[] numeros = new int[3];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("Números informados: " + Arrays.toString(numeros));

            System.out.println("O segundo número é: " + numeros[1]);

        } catch(InputMismatchException e) {
            System.out.println("[ERRO] Apenas números inteiros são aceitos!");
        }
    }
}
