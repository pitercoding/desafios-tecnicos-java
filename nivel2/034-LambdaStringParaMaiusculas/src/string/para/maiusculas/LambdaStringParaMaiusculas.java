package string.para.maiusculas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStringParaMaiusculas {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "gui", "lia", "bia", "carlos", "josé");
        nomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> listaNomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nLista final em maiúsculas: " + listaNomesMaiusculos);
    }
}
