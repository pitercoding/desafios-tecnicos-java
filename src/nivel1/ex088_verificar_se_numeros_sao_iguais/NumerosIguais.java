package nivel1.ex088_verificar_se_numeros_sao_iguais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            int num1 = input.nextInt();

            System.out.print("Digite outro numero: ");
            int num2 = input.nextInt();

            if (isNumerosIguais(num1, num2)) {
                System.out.printf("%d e %d são números iguais!%n", num1, num2);
            } else {
                System.out.printf("%d e %d não são números iguais!%n", num1, num2);
            }
        } catch(InputMismatchException e) {
            System.out.println("[ERRO] Apenas números inteiros são aceitos!");
        }
    }

    private static boolean isNumerosIguais(int num1, int num2) {
        return num1 == num2;
    }
}
