package nivel2.ex071_sistema_de_biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu(biblioteca);
        menu.iniciar();
    }
}
