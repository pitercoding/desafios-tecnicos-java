package contador;

import java.util.Scanner;

public class Main {

    /* Converte tudo para minúsculas para facilitar a comparação
       Inicializa o contador
       Percorre todos os caracteres da string
       Verifica se o caractere é uma vogal
       Retorna o total de vogais encontradas */

    public static int contarVogais(String texto) {
        texto = texto.toLowerCase();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u' || c == 'á' || c == 'à' || c == 'é'
                    || c == 'í' || c == 'ó' || c == 'ú') {
                contador ++;
            }
        }
        return contador;
    }

    /*  Método principal para testar o código:
        Cria o scanner
        Lê a linha inteira com espaços
        Mostra o resultado
        Fecha o scanner */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Contador de Vogais ===");
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();
        int resultado = contarVogais(entrada);
        System.out.println("Total de vogais: " + resultado);
        scanner.close();
    }
}