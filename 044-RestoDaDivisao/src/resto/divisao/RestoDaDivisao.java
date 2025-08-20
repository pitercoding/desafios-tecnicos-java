//Crie um método público em Java que irá receber dois valores inteiros, o dividendo e o divisor.
// O método deve imprimir no console o resultado da divisão e o resto dessa operação.
package resto.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestoDaDivisao {

    public static void realizarCalculo(int dividendo, int divisor) {
        // Validação de regra de negócio: divisão por zero
        if (divisor == 0) {
            throw new IllegalArgumentException("A divisão por zero não é permitida!");
        }

        // Realiza os cálculos
        int resultado = dividendo / divisor;
        int resto = dividendo % divisor;

        // Exibe os resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Resultado da divisão: " + resultado);
        System.out.println("Resto da divisão: " + resto);
    }

    private static int lerNumero(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                scanner.nextLine(); // limpa buffer inválido
            }
        }
    }

    private static boolean desejaContinuar(Scanner scanner) {
        while (true) {
            System.out.print("\nDeseja realizar outro cálculo? (S/N): ");
            String resposta = scanner.next().trim();
            if (resposta.equalsIgnoreCase("S")) {
                return true;
            } else if (resposta.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Entrada inválida! Digite apenas 'S' para sim ou 'N' para não.");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("\n--- Calculadora de Divisão Empresarial ---");

                int dividendo = lerNumero(scanner, "Digite o dividendo: "); //1ª chamada: método lerNumero()
                int divisor = lerNumero(scanner, "Digite o divisor: "); //2ª chamada: método lerNumero()

                try {
                    //3ª chamada: método realizarCalculo()
                    realizarCalculo(dividendo, divisor);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                //4ª chamada: método desejaContinuar()
                continuar = desejaContinuar(scanner);
            }
        }
        System.out.println("Programa encerrado. Até mais!");
    }
}
