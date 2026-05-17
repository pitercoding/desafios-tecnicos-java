package nivel2.ex089_media_idade_stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Racha Cuca", 47),
                new Pessoa("Poucas Trancas", 53),
                new Pessoa("Quase Nada", 39),
                new Pessoa("Tripa Seca", 40)
        );

        double media = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .average()
                .orElse(0);

        System.out.printf("Média de idades: %.2f%n", media);
    }
}
