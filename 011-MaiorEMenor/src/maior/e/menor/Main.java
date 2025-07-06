package maior.e.menor;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String entrada = scanner.nextLine(); //Lê tudo que foi digitado como uma String
        String[] partes = entrada.split(" ");

        if (partes.length == 0) {
            System.out.println("Nenhum número foi informado.");
            return;
        }

        try {
            int menor = Integer.MAX_VALUE;
            int maior = Integer.MIN_VALUE;
            int soma = 0;
            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            for (String parte : partes) {
                int numero = Integer.parseInt(parte);

                // Atualiza maior e menor
                if (numero < menor) menor = numero;
                if (numero > maior) maior = numero;

                // Soma para média
                soma += numero;

                // Separa pares e ímpares
                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
            }

            int quantidade = partes.length;
            double media = (double) soma / quantidade;
            String mediaFormatada = String.format("%.2f", media);

            // Saídas:
            System.out.println("\n📌 Resultados:");
            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
            System.out.println("Média: " + mediaFormatada);
            System.out.println("Pares: " + pares);
            System.out.println("Ímpares: " + impares);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas números inteiros válidos.");
        } finally {
            scanner.close();
        }
    }
}

/*
| Parte do código           | O que faz                                                              |
| ------------------------- | ---------------------------------------------------------------------- |
| `Integer.MAX_VALUE`       | Valor inicial enorme para garantir que qualquer número seja menor      |
| `Integer.MIN_VALUE`       | Valor inicial muito baixo para garantir que qualquer número seja maior |
| `entrada.split(" ")`      | Divide os números digitados pelo usuário                               |
| `Integer.parseInt(parte)` | Converte cada parte da String em inteiro                               |
| `if (numero < menor)`     | Atualiza o menor valor encontrado                                      |
| `if (numero > maior)`     | Atualiza o maior valor encontrado                                      |


| Parte nova do código                         | O que faz                                        |
| -------------------------------------------- | ------------------------------------------------ |
| `soma += numero;`                            | Acumula os valores para cálculo da média         |
| `double media = (double) soma / quantidade;` | Faz o cálculo da média usando cast para precisão |
| `numero % 2 == 0`                            | Verifica se o número é par                       |
| `pares.add(...)` / `impares.add(...)`        | Separa os números em duas listas                 |

 */