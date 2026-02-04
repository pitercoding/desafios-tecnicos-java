package nivel2.ex031_gerador_senha;

import java.util.Random;
import java.util.Scanner;

public class GeradorSenha {

    private static final Random random = new Random();

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITOS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}\\\\|;:'\\\",.<>?/";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Deseja uma senha de quantos dígitos? ");
        int tamanho = input.nextInt();
        System.out.println("Sua senha: " + gerarSenha(tamanho));
        input.close();
    }

    public static String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int escolha = random.nextInt(4); // agora vai de case 0 até 3
            switch (escolha) {
                case 0 -> senha.append(LETRAS_MAIUSCULAS.charAt(random.nextInt(LETRAS_MAIUSCULAS.length())));
                case 1 -> senha.append(LETRAS_MINUSCULAS.charAt(random.nextInt(LETRAS_MINUSCULAS.length())));
                case 2 -> senha.append(SIMBOLOS.charAt(random.nextInt(SIMBOLOS.length())));
                case 3 -> senha.append(DIGITOS.charAt(random.nextInt(DIGITOS.length())));
            }
        }
        return senha.toString();
    }
}
