package nivel2.ex063_veiculo_com_polimorfismo;

public abstract class Veiculo {
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public Veiculo(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void mover(){
        velocidade = velocidade + 1;
        System.out.println("Acelerando...");
        System.out.printf("Velocidade: %.2f\n", velocidade);
    }

    public void frear(){
        velocidade = velocidade - 1;
        System.out.println("Freando...");
        System.out.printf("Velocidade: %.2f\n", velocidade);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}
