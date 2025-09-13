package divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;
    private final DivisaoService service;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.service = new DivisaoService();
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Calculadora de Divisão Empresarial ---");

            int dividendo = lerNumero("Digite o dividendo: ");
            int divisor = lerNumero("Digite o divisor: ");

            try {
                Divisao divisao = new Divisao(dividendo, divisor);
                exibirResultado(divisao);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            continuar = desejaContinuar();
        }

        scanner.close();
        System.out.println("Programa encerrado. Até mais!");
    }

    private int lerNumero(String mensagem) {
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

    private void exibirResultado(Divisao divisao) {
        int resultado = service.calcularResultado(divisao);
        int resto = service.calcularResto(divisao);

        System.out.println("\n--- Resultados ---");
        System.out.println("Resultado da divisão: " + resultado);
        System.out.println("Resto da divisão: " + resto);
    }

    private boolean desejaContinuar() {
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
}
