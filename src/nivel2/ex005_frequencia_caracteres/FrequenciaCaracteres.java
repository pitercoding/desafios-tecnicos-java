package nivel2.ex005_frequencia_caracteres;

import java.util.*;

public class FrequenciaCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase(); // tudo minúsculo

        Map<Character, Integer> frequencia = new HashMap<>();

        for (char c : texto.toCharArray()) {
            if (c == ' ') continue; // ignora espaços

            // Se já existe no mapa, soma +1
            if (frequencia.containsKey(c)) {
                frequencia.put(c, frequencia.get(c) + 1);
            } else {
                frequencia.put(c, 1); // primeira vez
            }
        }

        System.out.println("\nFrequência de caracteres:");
        for (Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}

/*
| Parte                     | Explicação                                                 |
| ------------------------- | ---------------------------------------------------------- |
| `.toCharArray()`          | Transforma a `String` em um array de caracteres (`char[]`) |
| `Map<Character, Integer>` | Associa cada caractere a um contador (frequência)          |
| `containsKey(c)`          | Verifica se o caractere já está no mapa                    |
| `put(c, valor)`           | Insere ou atualiza o valor da chave (caractere)            |
| `toLowerCase()`           | Evita contar ‘A’ e ‘a’ como diferentes                     |

*/