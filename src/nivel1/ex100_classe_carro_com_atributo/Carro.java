package nivel1.ex100_classe_carro_com_atributo;

public class Carro {

    private String modelo;

    public Carro(String modelo) {
        setModelo(modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
