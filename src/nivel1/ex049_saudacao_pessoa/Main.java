package nivel1.ex049_saudacao_pessoa;

import static nivel1.ex049_saudacao_pessoa.Pessoa.saudacao;

public class Main {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(saudacao(pessoa.getNome()));
    }
}
