package nivel1.ex058_substituir_letra;

import java.util.Scanner;

public class SubstituirLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SUBSTITUIDOR DE LETRAS ===");

        try {
            System.out.print("Informe uma palavra, frase ou texto: ");
            String texto = scanner.nextLine().trim();

            if (texto.isEmpty()) {
                System.out.println("Texto vazio. Nada para substituir.");
                return;
            }

            System.out.print("Informe a letra que deseja substituir: ");
            String entrada = scanner.next().trim();
            if (entrada.length() != 1) {
                System.out.println("Informe apenas uma letra.");
                return;
            }
            char letraASerSubstituida = entrada.charAt(0);

            System.out.print("Informe a letra que deseja substituir por: ");
            entrada = scanner.next().trim();
            if (entrada.length() != 1) {
                System.out.println("Informe apenas uma letra.");
                return;
            }
            char letraParaSubstituir = entrada.charAt(0);

            System.out.println("Resultado: " + texto.replace(letraASerSubstituida, letraParaSubstituir));

        } finally {
            scanner.close();
        }
    }
}