package nivel1.ex050_menor__de_3_numeros;

import java.util.Scanner;

public class MenorNumero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Informe três números ===");

        System.out.printf("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.printf("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        System.out.println("O menor número é: " + calcularMenorNumero1(n1, n2, n3));
        System.out.println("O menor número é: " + calcularMenorNumero2(n1, n2, n3));

        scanner.close();
    }

    static double calcularMenorNumero1(double n1, double n2, double n3) {
        return Math.min(n1, Math.min(n2, n3));
    }

    static double calcularMenorNumero2(double n1, double n2, double n3) {
        double menorNumero;

        if (n1 < n2 && n1 < n3) {
            menorNumero = n1;
        } else if (n2 < n1 && n2 < n3) {
            menorNumero = n2;
        } else {
            menorNumero = n3;
        }
        return menorNumero;
    }
}
