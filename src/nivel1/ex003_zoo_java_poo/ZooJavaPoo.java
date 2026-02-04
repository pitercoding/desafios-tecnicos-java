package nivel1.ex003_zoo_java_poo;


public class ZooJavaPoo {
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