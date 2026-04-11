package nivel1.ex086_imprimir_primeiro_caractere;

import java.util.Scanner;

public class PrimeiroCaractere {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner (System.in)) {

            System.out.print("Informe uma frase: ");
            String frase = entrada.nextLine().trim();

            System.out.println(primeiraLetra(frase));

        } catch(IllegalArgumentException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
    }

    private static char primeiraLetra(String frase) {
        if(frase == null || frase.isEmpty()) {
            throw new IllegalArgumentException("Frase inválida!");
        }

        return frase.charAt(0);
    }
}
