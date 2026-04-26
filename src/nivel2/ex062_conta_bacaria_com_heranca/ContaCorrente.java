package nivel2.ex062_conta_bacaria_com_heranca;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo, String numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.0;
        double valorTotal = valor + taxa;

        if(valorTotal <= saldo){
            saldo -= valorTotal;
            System.out.println("Saque com taxa realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
