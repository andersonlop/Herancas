public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDejuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDejuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDejuros = taxaDejuros;
    }

    public double getSaldo() {
        return this.saldo + this.taxaDejuros*this.saldo;
    }
}
