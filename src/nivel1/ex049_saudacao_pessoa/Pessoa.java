package nivel1.ex049_saudacao_pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }
}
