package nivel1.ex028_hash_map_nome_idade;

import java.util.*;

public class HashMapNomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pessoas = new HashMap<>();

        while (pessoas.size() < 5) {
            System.out.print("\nNome da " + (pessoas.size() + 1) + "ª pessoa: ");
            String nome = scanner.nextLine().trim();

            if (nome.isEmpty()){
                System.out.println("[ERRO] O nome não pode estar vazio!");
                continue; // Se vazio pede novamente
            }

            if (pessoas.containsKey(nome)) {
                System.out.println("[ERRO] Essa pessoa já foi registrada! Digite outro nome!");
                continue; // Evita duplicata
            }

            System.out.print("Informe a idade: ");
            String idadeEntrada = scanner.nextLine().trim();

            if (idadeEntrada.isEmpty()) {
                System.out.println("[ERRO] Idade não pode estar vazia!");
                continue; // Se vazio pede novamente
            }

            int idade;
            try {
                idade = Integer.parseInt(idadeEntrada);
                if (idade < 0 || idade > 120){
                    System.out.println("[ERRO] Idade não pode ser negativa ou maior que 120 anos!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Informe uma idade válida!");
                continue;
            }
            pessoas.put(nome, idade);
        }
        scanner.close();

        // Encontrando o(s) mais velho(s)
        int idadeMaisAlta = Collections.max(pessoas.values());
        List<String> nomesMaisVelhos = new ArrayList<>();

        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            if (entrada.getValue() == idadeMaisAlta) {
                nomesMaisVelhos.add(entrada.getKey());
            }
        }

        // Todos Cadastrados
        System.out.println("\n===== Pessoas Cadastradas =====");
        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()){
            System.out.printf("Nome: %-15s | Idade: %d%n", entrada.getKey(), entrada.getValue());
        }

        //Resultado Final
        if (nomesMaisVelhos.size() == 1) {
            System.out.println("\nA pessoa com mais idade é " + nomesMaisVelhos.get(0) + " com " + idadeMaisAlta + " anos.");
        } else {
            System.out.println("\nOs mais velhos são: " + String.join(", ", nomesMaisVelhos) + " com " + idadeMaisAlta + " anos.");
        }
    }
}
