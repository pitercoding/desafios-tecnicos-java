package nivel1.ex051_resto_divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o primeiro número: ");
            int a = scanner.nextInt();

            System.out.print("Informe o segundo número: ");
            int b = scanner.nextInt();

            System.out.println("Resto da divisão = " + calcularRestoDaDivisao(a, b));

        } catch (InputMismatchException e) {
            System.out.println("Somente números inteiros são permitidos.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
        }
    }

    static int calcularRestoDaDivisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a % b;
    }
}