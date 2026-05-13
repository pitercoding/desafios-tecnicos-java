package nivel2.ex070_frequencia_palavras;

import java.util.HashMap;
import java.util.Map;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        String texto = "Cai, cai, balão, cai, cai, balão aqui na minha mão. Não cai não, não cai não, não cai não. Cai na rua do sabão";

        contarPalavras(texto);
    }

    private static void contarPalavras(String texto) {

        if (texto == null || texto.trim().isEmpty()) {
            System.out.println("Texto vazio ou inválido!");
            return;
        }

        texto = texto.toLowerCase()
                .trim()
                .replaceAll("[^a-záéíóúâêôãõç ]", "")
                .replaceAll("\\s+", " ");

        String[] palavras = texto.split(" ");

        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        for (String palavra : palavras) {

            if (!palavra.isEmpty()) {
                if (frequenciaPalavras.containsKey(palavra)) {
                    frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
                } else {
                    frequenciaPalavras.put(palavra, 1);
                }
            }
        }

        System.out.println(frequenciaPalavras);
    }
}
