package nivel1.ex080_classe_retangulo;

public class Retangulo {
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        setBase(base);       // usa os setters para validar
        setAltura(altura);
    }

    // Getter para base
    public double getBase() {
        return base;
    }

    // Setter para base com validação
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser positiva.");
        }
        this.base = base;
    }

    // Getter para altura
    public double getAltura() {
        return altura;
    }

    // Setter para altura com validação
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser positiva.");
        }
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return String.format("Retângulo [base=%.2f, altura=%.2f, área=%.2f]", base, altura, calcularArea());
    }
}