package nivel2.ex082_tostring_customizado;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String ocupacao;

    public Pessoa(String nome, int idade, String sexo, String ocupacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ocupacao = ocupacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    @Override
    public String toString() {
        return String.format(
                "%s possui %d anos, é do sexo %s e trabalha como %s.",
                nome,
                idade,
                sexo,
                ocupacao
        );
    }
}
