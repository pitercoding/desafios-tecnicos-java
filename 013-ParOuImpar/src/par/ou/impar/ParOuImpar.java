package par.ou.impar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        try {
            System.out.println("==== PAR OU ÍMPAR ====");
            System.out.print("Quantos números deseja digitar? ");
            int quantidade = scanner.nextInt();

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int n = scanner.nextInt();

                if (n % 2 == 0) {
                    pares.add(n);
                } else {
                    impares.add(n);
                }
            }

            // Exibição dos resultados
            System.out.println("\nRESULTADO:");
            System.out.println("Números pares: " + pares);
            System.out.println("Números ímpares: " + impares);

        } catch (Exception e) {
            System.out.println("[ERRO!] Informe um número inteiro válido!");
        } finally {
            scanner.close();
        }
    }
}

/*
| Modificação                             | Função                                       |
| --------------------------------------- | -------------------------------------------- |
| `List<Integer> pares`                   | Guarda os números pares digitados            |
| `List<Integer> impares`                 | Guarda os números ímpares digitados          |
| `for (int i = 1; i <= quantidade; i++)` | Permite o usuário digitar múltiplos números  |
| `for (int i = 1; ...)`                  | Cria a variável i e começa em 1. Contador    |
| `for (...; i <= quantidade; ...)`       | Enquanto i <= quantidade, o loop continua.   |
| `for (...; ...; i++)`                   | Após cada repetição, incrementa i em 1. i = i + 1.|
| `pares.add(...)` / `impares.add(...)`   | Adiciona cada número na lista correspondente |
 */