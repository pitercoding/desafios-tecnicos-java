package nivel1.ex076_antecessor_sucessor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==== Antecessor e Sucessor ====");
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.println("Antecessor: " + (numero - 1));
            System.out.println("Sucessor: " + (numero + 1));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}
