package nivel2.ex073_grouping_by;

public class Pessoa {
    private String nome;
    private String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return nome;
    }
}
