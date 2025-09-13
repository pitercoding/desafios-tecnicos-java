package maximo.divisor.comum;

import java.util.Scanner;

public class MaximoDivisorComum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int maximoDivisorComum = calcularMDC(a, b);
        System.out.println("O MDC de " + a + " e " + b + " é: " + maximoDivisorComum);
    }

    public static int calcularMDC(int a, int b) {
        // Caso base: quando o segundo número é 0, retornamos o primeiro
        if (b == 0) {
            return a;
        }
        // Chamada recursiva: MDC(b, a % b)
        return calcularMDC(b, a % b);
    }
}
