package nivel2.ex071_sistema_de_biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private int anoDeLancamento;

    public Livro(int id, String titulo, String autor, String editora, double preco, int anoDeLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                ", anoDeLancamento=" + anoDeLancamento +
                '}';
    }
}
