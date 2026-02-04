package nivel1.ex008_saudacao_personalizada;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static String criarSaudacao(String texto) {
        return "Olá, " + texto + "!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String resultado = criarSaudacao(nome);
        System.out.println(resultado);

        scanner.close();
    }
}
