package nivel1.ex067_conversor_real_dolar;

import java.util.Scanner;

public class ConversorRealDolar {

    private static final double TAXA_DOLAR = 5.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Conversor Real para Dólar =====");

        double valorReal = lerValorValido(scanner);
        double valorDolar = valorReal / TAXA_DOLAR;

        System.out.printf("Valor em dólar: $%.2f%n", valorDolar);

        scanner.close();
    }

    private static double lerValorValido(Scanner scanner) {
        while (true) {
            System.out.print("Digite um valor: R$ ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("Entrada inválida. Digite um valor válido.");
                continue;
            }

            try {
                double valor = Double.parseDouble(entrada);

                if (valor < 0) {
                    System.out.println("Erro: o valor não pode ser negativo.");
                    continue;
                }

                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número válido.");
            }
        }
    }
}
