package simulador.estoque;

public class Produto {
    String nome;
    int quantidade;

    // Construtor
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Adicionar quantidade
    public void adicionar(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println(qtd + " unidade(s) adicionada(s) ao estoque.");
        } else {
            System.out.println("[ERRO] Quantidade deve ser maior que 0!");
        }
    }

    // Remover quantidade
    public void remover(int qtd){
        if (qtd <= 0) {
            System.out.println("[ERRO] Quantidade deve ser maior que 0!");
        } else if (qtd > quantidade) {
            System.out.println("[ERRO] Estoque insuficiente!");
        } else {
            quantidade -= qtd;
            System.out.println(qtd + " unidade(s) removida(s) do estoque.");
        }
    }

    @Override
    public String toString() {
        return String.format("Produto: %-20s | Estoque: %d", nome, quantidade);
    }
}
