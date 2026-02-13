package nivel1.ex063_calcular_valor_compra_com_desconto;

public class CalcularDesconto {
    public static void main(String[] args) {
        double valorCompra = 100;
        double desconto = 0.1;
        double valorFinal = valorCompra - (valorCompra * desconto);
        System.out.println("Valor final: R$" + valorFinal);
    }
}
