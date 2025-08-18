package operacoes.aritmeticas;

import java.util.Scanner;

public class OperacoesAritmeticas {

    // Método que recebe dois números e mostra os resultados das operações
    public static void calcularOperacoes(double a, double b) {
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
        } else {
            System.out.println("Divisão: ERRO! não é possível dividir por zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Calculadora ====");
        System.out.print("Informe o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double b = scanner.nextDouble();

        System.out.printf("\nResultados entre %.1f e %.1f:", a, b);
        System.out.println();
        calcularOperacoes(a, b);

        scanner.close();
    }
}
