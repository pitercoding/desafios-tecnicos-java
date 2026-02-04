package nivel1.ex029_set_remover_nomes_repetidos;

import java.util.*;

public class SetRemoverNomesRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nomes = new LinkedHashSet<>(); // LinkedHashSet<>() para manter a ordem
        Map<String, String> normalizados = new HashMap<>(); // Map para controlar case-insensitive e manter a primeira forma digitada

        System.out.println("Informe os nomes (ENTER vazio para encerrar).");

        int contador = 1;
        while (true) {
            System.out.print(contador + "° nome: ");
            String nome = scanner.nextLine().trim();

            if (nome.isEmpty()) {
                System.out.println("Encerrando...");
                break;
            }

            String chave = nome.toLowerCase(); // normaliza para comparar sem case
            if (!normalizados.containsKey(chave)) {
                normalizados.put(chave, nome); // mantém primeira forma digitada
                nomes.add(nome); // adiciona no Set
                contador++; // incrementa só se realmente adicionou
            } else {
                System.out.println("[Aviso] Nome duplicado ignorado: " + nome);
            }
        }
        scanner.close();

        if (!nomes.isEmpty()) {
            System.out.println("\n==== Lista de Nomes Sem Repetições ====");
            for (String nome: nomes) {
                System.out.println(nome);
            }
        }
    }
}
