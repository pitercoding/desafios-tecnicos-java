package nivel1.ex003_zoo_java_poo;

public abstract class Animal {
    private String nomeCientifico;
    private String som;

    //Construtor
    public Animal(String nomeCientifico, String som) {
        this.nomeCientifico = nomeCientifico;
        this.som = som;
    }

    //Getters
    public String getNomeCientifico(){
        return nomeCientifico;
    }

    public String getSom(){
        return som;
    }

    //Método abstrato (para ser implementado nas subclasses)
    public abstract void emitirSom();
}

//abstract: essa classe não pode ser instanciada diretamente.
//Atributos privados ➝ encapsulamento.
//Construtor: obriga a passar nome e som ao criar um animal.
//emitirSom() é abstrato → cada animal implementa o som do seu jeito.