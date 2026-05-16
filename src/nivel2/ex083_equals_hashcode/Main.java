package nivel2.ex083_equals_hashcode;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Volkswagen", "Kombi");
        Carro c2 = new Carro("Volkswagen", "Kombi");

        System.out.println(c1.equals(c2));
    }
}
