package apenas.digitos.em.string;

import java.util.Scanner;

public class ApenasDigitosEmString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        boolean somenteDigitos = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') { // verifica se não é dígito
                somenteDigitos = false;
                break; // sai do laço assim que encontrar um não dígito
            }
        }

        if (somenteDigitos) {
            System.out.println("A string contém apenas dígitos.");
        } else {
            System.out.println("A string contém caracteres que não são dígitos.");
        }
    }
}
