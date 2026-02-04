package nivel3.ex005_menu_com_do_while;

import java.util.Scanner;

public class MenuComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nEscolha uma opção do Menu:");
            System.out.println("[1] Ver saldo");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: 1.000,00R$");
            } else if (opcao == 2) {
                System.out.println("Depósito efetuado com sucesso!");
            } else if (opcao != 3) {
                System.out.println("Informe uma opção válida!");
            }
        } while (opcao != 3);

        System.out.println("Finalizando menu...");
        System.out.println("Volte sempre!");
        scanner.close();
    }
}
