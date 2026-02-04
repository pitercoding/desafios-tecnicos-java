package nivel2.ex012_caixa_eletronico;


import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        int opcao;

        do {
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDepositado = scanner.nextDouble();
                    conta.depositar(valorDepositado);
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o Caixa Eletrônico!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao !=0);
        scanner.close();
    }
}
