package divisao;

public class Divisao {
    private final int dividendo;
    private final int divisor;

    public Divisao(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero.");
        }
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }
}
