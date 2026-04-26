package nivel2.ex062_conta_bacaria_com_heranca;

public class ContaBancaria {
    protected String titular;
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println(valor + " R$ depositado com sucesso!");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println(valor + " R$ sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
