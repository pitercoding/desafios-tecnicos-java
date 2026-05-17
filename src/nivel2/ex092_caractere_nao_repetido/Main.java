package nivel2.ex092_caractere_nao_repetido;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String texto = "aabbccddees";

        Character resultado = encontrarPrimeiroNaoRepetido(texto);

        if (resultado != null) {
            System.out.println("Primeiro não repetido: " + resultado);
        } else {
            System.out.println("Todos os caracteres se repetem.");
        }
    }

    public static Character encontrarPrimeiroNaoRepetido(String texto) {
        if ( texto == null || texto.isEmpty()) {
            return null;
        }

        Map<Character, Integer> frequencia = new HashMap<>();

        // conta frequência
        for (char c : texto.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        // encontra primeiro não repetido
        for (char c : texto.toCharArray()) {
            if (frequencia.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
