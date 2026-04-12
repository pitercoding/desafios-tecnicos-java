package nivel1.ex094_impimir_tamanho_string;

import java.util.Scanner;

public class ImprimirTamanhoString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite uma palavra ou frase: ");
            String sentenca = input.nextLine().trim();

            System.out.println("Tamanho: " + contarCaracteresSemEspaco(sentenca) + " caracteres.");
        }
    }

    private static int contarCaracteresSemEspaco(String sentenca){
        return sentenca == null ? 0 : sentenca.replaceAll("\\s+", "").length();
    }
}
