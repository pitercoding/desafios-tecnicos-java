package nivel2.ex014_elementos_repetidos;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ElementosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String entrada = scanner.nextLine();

        // Quebra a entrada por espaços e converte para inteiros
        String[] partes = entrada.split(" ");
        Set<Integer> unicos = new LinkedHashSet<>();

        for (String parte : partes) {
            try{
                int numero = Integer.parseInt(parte);
                unicos.add(numero); // adiciona ao LinkedHashSet (sem duplicados)
            } catch (NumberFormatException e) {
                System.out.println("Ignorado valor inválido: " + parte);
            }
        }
        System.out.println("Sem duplicados:");
        for (int num : unicos) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

/**
 * | Componente      | Função                                                               |
 * | --------------- | -------------------------------------------------------------------- |
 * | `LinkedHashSet` | Armazena elementos únicos mantendo a ordem original                  |
 * | `for-each` loop | Adiciona cada elemento do array no `Set`                             |
 * | `Set<Integer>`  | Usado no lugar de `List` para eliminar os duplicados automaticamente |
 */