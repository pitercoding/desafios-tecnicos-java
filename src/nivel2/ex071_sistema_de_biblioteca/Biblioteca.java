package nivel2.ex071_sistema_de_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    // POST
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    // DELETE
    public boolean removerLivroPorId(int id){
        return livros.removeIf(l -> l.getId() == id);
    }

    // GET ALL
    public List<Livro> listarLivros(){
        return new ArrayList<>(livros);
    }

    // GET BY TÍTULO
    public Optional<Livro> buscarLivroPorTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }

    // GET BY AUTOR
    public List<Livro> buscarLivrosPorAutor(String autor){

        List<Livro> resultado = new ArrayList<>();

        for(Livro livro : livros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                resultado.add(livro);
            }
        }
        return resultado;
    }

    // GET BY EDITORA
    public List<Livro> buscarLivroPorEditora(String editora){
        List<Livro> resultado = new ArrayList<>();

        for(Livro livro : livros){
            if(livro.getEditora().equalsIgnoreCase(editora)){
                resultado.add(livro);
            }
        }
        return resultado;
    }

    // GET BY ANO DE LANÇAMENTO
    public List<Livro> buscarLivroPorAnoDeLancamento(int anoDeLancamento){
        List<Livro> resultado = new ArrayList<>();

        for(Livro livro : livros){
            if(livro.getAnoDeLancamento() == anoDeLancamento){
                resultado.add(livro);
            }
        }
        return resultado;
    }
}
