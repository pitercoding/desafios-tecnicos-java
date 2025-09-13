package services;

import models.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimaisEmitirSom() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

//Cria uma lista de Animal, que pode armazenar tanto Leao quanto Macaco → polimorfismo.
//adicionarAnimal(): adiciona um novo animal.
//listarAnimaisEmitindoSom(): percorre a lista e chama emitirSom() (cada animal se comporta de forma diferente, mesmo método → polimorfismo na prática).