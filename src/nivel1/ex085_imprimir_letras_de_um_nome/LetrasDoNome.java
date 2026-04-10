package nivel1.ex085_imprimir_letras_de_um_nome;

import java.util.Scanner;

public class LetrasDoNome {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Informe um nome: ");
            String nome = input.nextLine().trim();

            System.out.println(nome + " possui " + contarLetras(nome) + " letras");
        }
    }

    private static int contarLetras(String nome){
        return nome == null ? 0 : nome.replaceAll("\\s+", "").length();
    }
}
