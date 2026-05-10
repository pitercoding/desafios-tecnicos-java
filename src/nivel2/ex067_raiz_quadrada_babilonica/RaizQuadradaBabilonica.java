package nivel2.ex067_raiz_quadrada_babilonica;

public class RaizQuadradaBabilonica {
    public static void main(String[] args) {

        double numero = 4;

        System.out.println(raizQuadradaBabilonica(numero));
    }

    public static double raizQuadradaBabilonica(double numero) {

        if (numero < 0) throw new IllegalArgumentException("Número negativo!");
        if (numero == 0) return 0;

        double x = numero;
        double precisao = 0.00001;

        while (Math.abs(x * x - numero) > precisao) {
            x = (x + numero / x) / 2;
        }

        return x;
    }
}
