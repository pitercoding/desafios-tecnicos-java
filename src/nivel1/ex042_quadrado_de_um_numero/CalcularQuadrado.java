package nivel1.ex042_quadrado_de_um_numero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularQuadrado {

    public static void main(String[] args) {

        // Ler valor
        double n = lerValor("Digite o valor que deseja elevar ao quadrado: ");

        // Calcular
        double resultado = calcularNumeroAoQuadrado(n);

        // Exibir resultado
        System.out.printf("Resultado: %.2f ao quadrado é %.2f%n", n, resultado);
    }

    // Método que lê o número
    public static double lerValor(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("[ERRO!] Somente números são aceitos!");
                scanner.nextLine(); // limpa o buffer
            }
        }
    }

    // Método que calcula o número ao quadrado
    public static double calcularNumeroAoQuadrado(double n) {
        return n * n;
    }
}