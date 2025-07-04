package models;

public class Leao extends Animal {
    public Leao() {
        super("Panthera leo", "Rugido!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Leão: " + getSom());
    }
}

//super(...) chama o construtor da classe Animal.
//@Override: implementa o método abstrato da classe mãe.
//Usa getSom() da superclasse (herança + encapsulamento).