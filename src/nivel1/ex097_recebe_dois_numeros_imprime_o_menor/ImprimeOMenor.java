package nivel1.ex097_recebe_dois_numeros_imprime_o_menor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImprimeOMenor {
    public static void main(String[] args) {

        System.out.println("==== Menor Número ====");

        try(Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite o primeiro numero: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            int n2 = scanner.nextInt();

            if (n1 == n2) {
                System.out.println("Os números são iguais!");
            } else {
                System.out.println("O menor número é: " + identificaOMenorNumero(n1, n2));
            }

        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas números são aceito!");
        }
    }

    private static int identificaOMenorNumero(int n1, int n2) {
        return Math.min(n1, n2);
    }
}
