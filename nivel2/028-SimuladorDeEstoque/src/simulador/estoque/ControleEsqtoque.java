package simulador.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleEsqtoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n==== MENU ESTOQUE ====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int qtdInicial = scanner.nextInt();
                    produtos.add(new Produto(nome, qtdInicial));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do produto para adicionar: ");
                    String nomeAdd = scanner.nextLine();
                    Produto produtoAdd = buscarProduto(produtos, nomeAdd);
                    if (produtoAdd != null) {
                        System.out.print("Quantidade a adicionar: ");
                        int qtdAdd = scanner.nextInt();
                        produtoAdd.adicionar(qtdAdd);
                    } else {
                        System.out.println("[ERRO] Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Nome do produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    Produto produtoRemover = buscarProduto(produtos, nomeRemover);
                    if (produtoRemover != null) {
                        System.out.print("Quantidade a remover: ");
                        int qtdRemover = scanner.nextInt();
                        produtoRemover.remover(qtdRemover);
                    } else {
                        System.out.println("[ERRO] Produto não encontrado!");
                    }
                    break;

                case 4:
                    if (produtos.isEmpty()){
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n==== ESTOQUE ATUAL ====");
                        produtos.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("[ERRO] Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // Método auxiliar para buscar produto pelo nome
    private static Produto buscarProduto(List<Produto> produtos, String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}


