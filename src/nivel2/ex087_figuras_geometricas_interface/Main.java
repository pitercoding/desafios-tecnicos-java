package nivel2.ex087_figuras_geometricas_interface;

public class Main {
    public static void main(String[] args) {
        Calculavel quadrado = new Quadrado(4);
        Calculavel retangulo = new Retangulo(5, 3);
        Calculavel circulo = new Circulo(2);

        System.out.printf("Area do quadrado: %.2f\n", quadrado.calcularArea());
        System.out.printf("Area do retângulo: %.2f\n", retangulo.calcularArea());
        System.out.printf("Area do círculo: %.2f\n", circulo.calcularArea());
    }
}
