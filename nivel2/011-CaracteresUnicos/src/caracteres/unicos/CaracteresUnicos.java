package caracteres.unicos;

import java.util.HashSet;
import java.util.Scanner;

public class CaracteresUnicos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==== TESTANDO CARACTERES ====");
            System.out.print("Informe uma palavra para o teste: ");
            String entrada = scanner.nextLine();

            boolean resultado = todosCaracteresUnicos(entrada);
            System.out.println("Todos os caracteres de [" + entrada + "] são únicos? " + resultado);

        } catch (Exception e) {
            System.out.println("[ERRO!] Informe um caractere válido!");
        } finally {
            scanner.close();
        }
    }

    public static boolean todosCaracteresUnicos(String str) {
        HashSet<Character> caracteresVistos = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (caracteresVistos.contains(c)) {
                return false;
            }
            caracteresVistos.add(c);
        }
        return true;
    }
}

/*
- Scanner: Lê a entrada do usuário.
- HashSet<Character>: Armazena os caracteres já vistos (sem repetições).
- for (char c : str.toCharArray()): Converte a string em um array de caracteres e percorre um por um.
  Verificação:
- Se o caractere já estiver no HashSet, então já apareceu antes → retorna false.
- Se não, adiciona o caractere ao HashSet.
- Se nenhum caractere for repetido, retorna true.

  str.toCharArray()
- A expressão str.toCharArray() em Java transforma uma String em um vetor de caracteres (char[])
- Facilita operações como:
   -> Percorrer cada caractere com um for
   -> Comparar caracteres individualmente
   -> Armazenar ou processar cada letra separadamente
 */