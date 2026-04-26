package nivel2.ex063_veiculo_com_polimorfismo;

public class PistaDeCorrida {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Toyota", "Corolla", 2020, 0);
        Veiculo v2 = new Moto("Honda", "CB500", 2021, 0);

        v1.mover();
        v1.mover();
        v2.mover();
        v2.mover();
    }
}
