package conversor.binario.decimal;

import java.util.Scanner;

public class Conversor {
    // Veja um conversor bacana em https://basesnumericas.pages.dev/conversor

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        String numero = input.nextLine();
        System.out.printf("%s (base 2) = %d (base 10)%n", numero, converter(numero));
        input.close();
    }

    public static long converter(String numero) {
        try {
            return Long.parseLong(numero, 2);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o número informado não é binário!");
            return -1;
        }
    }

}
