package validador.de.senha;

import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== VALIDADOR DE SENHA ====");
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean tamanhoOk = senha.length() >= 8;
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temNumero = senha.matches(".*[0-9].*");
        boolean temEspecial = senha.matches(".*[!@#$%^&*()_+\\-={}:;\"',.<>?/].*");

        if (tamanhoOk && temMaiuscula && temNumero && temEspecial) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca. Requisitos:");
            if (!tamanhoOk) System.out.println("- Insira pelo menos 8 caracteres!");
            if (!temMaiuscula) System.out.println("- Insira pelo 1 letra maiúscula!");
            if (!temNumero) System.out.println("- Insira pelo menos 1 número!");
            if (!temEspecial) System.out.println("- Insira pelo menos 1 caractere especial!");
        }
        scanner.close();
    }
}

