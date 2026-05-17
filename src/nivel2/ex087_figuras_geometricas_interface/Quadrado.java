package nivel2.ex087_figuras_geometricas_interface;

public class Quadrado implements Calculavel {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
