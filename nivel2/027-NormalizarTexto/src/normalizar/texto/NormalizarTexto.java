package normalizar.texto;

import java.text.Normalizer;
import java.util.Scanner;

public class NormalizarTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um texto que deseja normalizar: ");
        String textoDigitado = scanner.nextLine();

        String semAcentos = Normalizer.normalize(textoDigitado, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", ""); // O regex \\p{M} remove todos os diacríticos (acentos, cedilhas etc.).

        String normalizado = semAcentos.toLowerCase();

        System.out.println("\nTexto normalizado:");
        System.out.println(normalizado);

        scanner.close();
    }
}
