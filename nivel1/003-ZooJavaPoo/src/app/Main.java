package app;

import models.Leao;
import models.Macaco;
import services.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        // Criar animais
        Leao leao = new Leao();
        Macaco macaco = new Macaco();

        // Adicionar ao zoológico
        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(macaco);

        // Mostrar sons
        zoo.listarAnimaisEmitirSom();
    }
}

//Instancia o serviço Zoologico.
//Cria os animais (Leao, Macaco).
//Adiciona à lista e executa o método emitirSom() para cada um.