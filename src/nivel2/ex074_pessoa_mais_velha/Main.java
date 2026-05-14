package nivel2.ex074_pessoa_mais_velha;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("João", 52),
                new Pessoa("Maria", 40),
                new Pessoa("Pedro", 31),
                new Pessoa("Ana", 52)
        );

        int maiorIdade = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .max()
                .orElse(0);

        List<Pessoa> maisVelhas = pessoas.stream()
                .filter(p -> p.getIdade() == maiorIdade)
                .toList();

        maisVelhas.forEach(System.out::println);
    }
}
