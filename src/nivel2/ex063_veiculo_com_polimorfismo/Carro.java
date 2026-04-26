package nivel2.ex063_veiculo_com_polimorfismo;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano, double velocidade) {
        super(marca, modelo, ano, velocidade);
    }

    @Override
    public void mover() {
        velocidade += 5;
        System.out.println("Carro acelerando...");
        System.out.println("Velocidade: " + velocidade + " Km/h");
    }
}
