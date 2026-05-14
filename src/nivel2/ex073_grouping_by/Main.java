package nivel2.ex073_grouping_by;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("João", "São Paulo"),
                new Pessoa("Maria", "Rio"),
                new Pessoa("Pedro", "São Paulo"),
                new Pessoa("Ana", "Curitiba"),
                new Pessoa("Carlos", "Rio")
        );

        Map<String, List<Pessoa>> pessoasPorCidade =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCidade));

        System.out.println(pessoasPorCidade);
    }
}
