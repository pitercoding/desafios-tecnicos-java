package maior.menor.textos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaiorEMenorTextos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frases = new ArrayList<>();

        System.out.println("========== Frases Menores e Maiores ==========");
        System.out.println("Critérios de desempate: Tamanho e Ordem Alfabética.");
        while (true) {
            System.out.print("Informe suas frases (ENTER sem digitar nada para sair.): ");
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                break;
            }
            frases.add(entrada);
        }
        scanner.close();

        if (frases.isEmpty()) {
            System.out.println("\n[ERRO!] Nenhuma frase foi informada!");
            return;
        }

        System.out.println("\nSuas frases:");
        for (String frase : frases) {
            System.out.println(frase);
        }

        String menorString = frases.get(0);
        String maiorString = frases.get(0);

        for (int i = 1; i < frases.size(); i++) {
            String fraseAtual = frases.get(i);
            if (fraseAtual.length() > maiorString.length() ||
                    (fraseAtual.length() == maiorString.length() &&
                            fraseAtual.compareToIgnoreCase(maiorString) > 0)) {
                maiorString = fraseAtual;
            }
            if (fraseAtual.length() < menorString.length() ||
                    (fraseAtual.length() == menorString.length() &&
                            fraseAtual.compareToIgnoreCase(menorString) < 0)) {
                menorString = fraseAtual;
            }
        }

        System.out.println("\nMaior frase: " + maiorString);
        System.out.println("Menor frase: " + menorString);
    }
}
