package nivel2.ex022_minimo_multiplo_comum;

import java.util.Scanner;

public class MinimoMultiploComum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int maximoDivisorComum = calcularMDC(a, b);
        int minimoMultiploComum = (a * b) / maximoDivisorComum;

        System.out.println("MMC de " + a + " e " + b + " é: " + minimoMultiploComum);
    }

    // Método recursivo do MDC
    public static int calcularMDC(int a, int b) {
        if (b == 0) return a;
        return calcularMDC(b, a % b);
    }
}
