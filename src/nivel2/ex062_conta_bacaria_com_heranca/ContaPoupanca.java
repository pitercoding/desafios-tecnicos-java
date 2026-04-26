package nivel2.ex062_conta_bacaria_com_heranca;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo, String numeroConta) {
        super(titular, saldo, numeroConta);
    }

    public void renderJuros() {
        saldo += saldo * 0.02;
    }
}
