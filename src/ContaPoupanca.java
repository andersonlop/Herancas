public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDejuros;
    private int limiteSaque;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDejuros, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDejuros = taxaDejuros;
        this.limiteSaque = limiteSaque;
    }

    public double getSaldo() {
        return this.saldo + this.taxaDejuros*this.saldo;
    }
}
