package verificador.vogal;

import java.util.Scanner;

public class LetraVogal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Verificador de Vogal =====");
        System.out.print("Informe uma letra (a-z): ");
        String entrada = scanner.nextLine().trim();

        if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))){
            System.out.println("[ERRO] Informe apenas uma letra válida!");
        } else {
            char letra = Character.toLowerCase(entrada.charAt(0));
            String vogais = "aeiou";

            String resultado = vogais.contains(String.valueOf(letra))
                    ? letra + " é vogal!"
                    : letra + " não é vogal!";

            System.out.println(resultado);
        }

        scanner.close();
    }
}
