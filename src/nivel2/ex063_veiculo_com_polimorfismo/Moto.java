package nivel2.ex063_veiculo_com_polimorfismo;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano, double velocidade) {
        super(marca, modelo, ano, velocidade);
    }

    @Override
    public void mover() {
        velocidade += 2;
        System.out.println("Moto acelerando...");
        System.out.println("Velocidade: " + velocidade + " Km/h");
    }
}
