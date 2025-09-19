package verificacao.voto;

import java.util.Scanner;

public class VerificarVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Verificação de Voto =====");

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        System.out.print("Você possui título de eleitor? (sim/não): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        
        if (resposta.equals("não")) { resposta = "nao"; } // Normaliza "não" (com ou sem acento)

        boolean temTitulo = resposta.equals("sim") || resposta.equals("s");

        if (idade >= 16 && idade <= 65 && temTitulo) {
            System.out.println("Pode votar normalmente.");
        } else {
            System.out.println("Não pode votar.");
        }

        scanner.close();
    }
}

