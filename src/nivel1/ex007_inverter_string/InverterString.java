package nivel1.ex007_inverter_string;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(" ===== INVERTER UMA STRING =====   ");
            System.out.print("Digite uma palavra ou frase: ");
            String texto = scanner.nextLine();

            String textoInvertido = new StringBuilder(texto).reverse().toString();
            String textoMinusculo = texto.toLowerCase();
            String textoMaiusculo = texto.toUpperCase();

            System.out.println("\n*** RESULTADOS ***");
            System.out.println("Original: " + texto);
            System.out.println("Invertido: " + textoInvertido);
            System.out.println("Minúsculas: " + textoMinusculo);
            System.out.println("Maiúsculas: " + textoMaiusculo);

        } catch (Exception e) {
            System.out.println("Erro ao ler o texto.");
        } finally {
            scanner.close();
        }
    }
}