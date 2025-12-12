package area.retangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularAreaRetangulo {

    public static void main(String[] args) {

        //Ler valores
        double base = lerValor("Digite a base do retângulo:");
        double altura = lerValor("Digite a altura do retângulo:");

        // Calcular área
        double area = calcularArea(base, altura);

        // Exibir resultado
        System.out.println("A área do retângulo é: " + area);
    }

    // Método para ler um valor double do usuário
    public static double lerValor(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double valor = -1;

        while (true) {
            try {
                System.out.println(mensagem);
                valor = scanner.nextDouble();

                if (valor < 0) {
                    System.out.println("Erro: o valor não pode ser negativo. Tente novamente.\n");
                } else {
                    return valor; // valor válido
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.\n");
                scanner.nextLine(); // limpa o buffer
            }
        }
    }

    // Método que recebe base e altura e devolve a área
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
