package nivel1.ex057_contem_letra_a;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um texto: ");
            String texto = scanner.nextLine().trim();

            if (texto.isEmpty()) {
                System.out.println("Texto vazio. Digite um texto válido.");
                return;
            } else {
                System.out.println("contém a letra 'a'? " + contemLetraA(texto));
            }
        } finally {
            scanner.close();
        }
    }

    static boolean contemLetraA(String texto) {
        return texto.toLowerCase().contains("a");
    }
}
