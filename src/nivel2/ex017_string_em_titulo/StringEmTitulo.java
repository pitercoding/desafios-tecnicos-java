package nivel2.ex017_string_em_titulo;

import java.util.Scanner;

public class StringEmTitulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        StringBuilder titulo = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                // Capitaliza a primeira letra e junta com o restante em minúsculo
                String capitalizada = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                titulo.append(capitalizada).append(" ");
            }
        }

        // Imprime o resultado removendo o espaço extra no final
        System.out.println("Resultado: " + titulo.toString().trim());

        scanner.close();
    }
}

/**
 * | **Linha de Código**                                                                                 | **Explicação**                                                                   | **Exemplo / Observação**                                                                                     |
 * | --------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------ |
 * | `String[] palavras = frase.trim().split("\\s+");`                                                   | Remove espaços extras e divide a frase em palavras, mesmo com múltiplos espaços. | `"  ola   mundo  "` → `["ola", "mundo"]`                                                                     |
 * | `StringBuilder titulo = new StringBuilder();`                                                       | Cria um `StringBuilder` para montar a frase final de forma eficiente.            | Evita uso excessivo de `+` com `String`                                                                      |
 * | `for (String palavra : palavras) {`                                                                 | Percorre cada palavra do array.                                                  | Loop `for-each`                                                                                              |
 * | `if (!palavra.isEmpty()) {`                                                                         | Garante que a palavra não esteja vazia antes de capitalizar.                     | Evita erro com `substring`                                                                                   |
 * | `String capitalizada = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();` | Capitaliza a primeira letra da palavra e coloca o restante em minúsculo.         | `"jAVa"` → `"Java"`                                                                                          |
 * | `titulo.append(capitalizada).append(" ");`                                                          | Adiciona a palavra capitalizada ao resultado final com um espaço.                | Frase final sendo montada                                                                                    |
 * | —                                                                                                   | **Resultado Final:** string com cada palavra capitalizada e separada por espaço. | `"ola   MUNDO  java"` → `"Ola Mundo Java "` (pode usar `.trim()` ao final se quiser remover o último espaço) |
 */