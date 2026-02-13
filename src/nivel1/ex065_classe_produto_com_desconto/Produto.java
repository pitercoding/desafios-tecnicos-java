package nivel1.ex065_classe_produto_com_desconto;

public class Produto {
    private String nome;
    private double preco;
    private int desconto;

    public Produto(String nome, double preco, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        if (desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Desconto deve estar entre 0 e 100.");
        }
        this.desconto = desconto;
    }

    public void aplicarDesconto(int percentual) {
        double valorDesconto = preco * percentual / 100;
        preco -= valorDesconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
