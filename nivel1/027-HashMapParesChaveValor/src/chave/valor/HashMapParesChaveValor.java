package chave.valor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapParesChaveValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();

        int contador = 0;
        while (contador < 5) {
            System.out.print("\nNome do produto " + (contador + 1) + ": ");
            String nome = scanner.nextLine().trim();

            if (nome.isEmpty()){
                System.out.println("[ERRO] O nome não pode estar vazio!");
                continue; // Volta para pedir de novo
            }

            if (produtos.containsKey(nome)) {
                System.out.println("[ERRO] Produto já informado. Digite outro nome!");
                continue; // evita duplicata
            }

            System.out.print("Preço do produto: ");
            String entradaPreco = scanner.nextLine().trim();
            double preco;

            try {
                preco = Double.parseDouble(entradaPreco);
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Informe um número válido para o preço!");
                continue; // volta e pede novamente
            }
            produtos.put(nome, preco);
            contador++;
        }
        scanner.close();

        System.out.println("\n===== Produtos Cadastrados =====");
        for (Map.Entry<String, Double> entrada : produtos.entrySet()) {
            System.out.printf("Produto: %-15s | Preço: R$ %.2f%n", entrada.getKey(), entrada.getValue());
        }
    }
}
