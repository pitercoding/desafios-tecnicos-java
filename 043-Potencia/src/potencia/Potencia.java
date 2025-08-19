package potencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Potencia {

    public static double calcularPotencia(double base, double expoente) {
        if (expoente == 0) {
            return 1.0;
        }
        if (base == 0 && expoente < 0) {
            throw new IllegalArgumentException("Não é possível calcular 0 elevado a um expoente negativo (divisão por zero).");
        }
        return Math.pow(base, expoente);
    }

    // Método auxiliar para ler números com validação
    public static double lerNumero(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); // descarta a entrada errada para evitar loop infinito
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double base = lerNumero(scanner, "Informe o número base: ");
            double expoente = lerNumero(scanner, "Informe o expoente: ");

            try {
                double resultado = calcularPotencia(base, expoente);
                System.out.printf("Resultado: %.4f%n", resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
