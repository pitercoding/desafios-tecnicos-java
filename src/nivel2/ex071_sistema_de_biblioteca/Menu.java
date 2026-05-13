package nivel2.ex071_sistema_de_biblioteca;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;
    private Scanner scanner;

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar(){

        int opcao;

        do {
            try {
                System.out.println("\n===== BIBLIOTECA =====");
                System.out.println("1 - Adicionar livro");
                System.out.println("2 - Listar livros");
                System.out.println("3 - Buscar por título");
                System.out.println("4 - Buscar por autor");
                System.out.println("5 - Buscar por editora");
                System.out.println("6 - Buscar por ano");
                System.out.println("7 - Remover livro por ID");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> adicionarLivro();
                    case 2 -> listarLivros();
                    case 3 -> buscarPorTitulo();
                    case 4 -> buscarPorAutor();
                    case 5 -> buscarPorEditora();
                    case 6 -> buscarPorAno();
                    case 7 -> removerLivro();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException  e) {
                System.out.println("[ERRO] Digite um número válido!");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private void adicionarLivro() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Livro livro =  new Livro(id, titulo, autor, editora, preco, ano);

        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void listarLivros() {
        List<Livro> livros = biblioteca.listarLivros();

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado!");
        }
        livros.forEach(System.out::println);
    }

    private void buscarPorTitulo() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        biblioteca.buscarLivroPorTitulo(titulo)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Livro não encontrado!")
                );
    }

    private void buscarPorAutor() {
        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        List<Livro> livrosEncontrados =
                biblioteca.buscarLivrosPorAutor(autor);

        if (livrosEncontrados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para esse autor!");
        } else {
            livrosEncontrados.forEach(System.out::println);
        }
    }

    private void buscarPorEditora() {
        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        List<Livro> livrosEncontrados =
                biblioteca.buscarLivroPorEditora(editora);

        if (livrosEncontrados.isEmpty()) {
            System.out.println("Nenhum livro encontrado!");
        } else {
            livrosEncontrados.forEach(System.out::println);
        }
    }

    private void buscarPorAno() {
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        if (ano < -2000 || ano > LocalDate.now().getYear()) {
            System.out.println("Informe um ano válido (-2000 até ano atual)!");
            return;
        }

        List<Livro> livrosEncontrados =
                biblioteca.buscarLivroPorAnoDeLancamento(ano);

        if (livrosEncontrados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para esse ano!");
        } else {
            livrosEncontrados.forEach(System.out::println);
        }
    }

    private void removerLivro() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            boolean removido = biblioteca.removerLivroPorId(id);

            System.out.println(
                    removido
                            ? "Livro removido!"
                            : "[ERRO] Livro não encontrado!"
            );

        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Digite um número válido!");
            scanner.nextLine();
        }
    }
}
