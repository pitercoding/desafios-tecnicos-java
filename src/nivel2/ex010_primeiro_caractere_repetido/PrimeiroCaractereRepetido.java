package nivel2.ex010_primeiro_caractere_repetido;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeiroCaractereRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        Character repetido = encontrarPrimeiroRepetido(texto);

        if (repetido != null) {
            System.out.println("O primeiro caractere repetido é: '" + repetido + "'");
        } else {
            System.out.println("Nenhum caractere se repete.");
        }
        scanner.close();
    }

    public static Character encontrarPrimeiroRepetido(String texto) {
        Set<Character> vistos = new HashSet<>();

        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == ' ') continue;

            if (vistos.contains(c)) {
                return c;
            }
            vistos.add(c);
        }
        return null; // nenhum repetido
    }
}
