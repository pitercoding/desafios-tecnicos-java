package nivel2.ex078_comparator_lambda_ordenacao_pessoa;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = List.of(
                new Pessoa("Racha Cuca",30),
                new Pessoa("Poucas Trancas", 25),
                new Pessoa("Quase Nada", 40),
                new Pessoa("Tripa Seca", 20)
        );

        List<Pessoa> pessoasOrdenadas = pessoas.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .toList();

        pessoasOrdenadas.forEach(System.out::println);
    }
}
