package models;

public class Macaco extends Animal {
    public Macaco() {
        super("Cebus apella", "Uh uh ah ah!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Macaco: " + getSom());
    }
}