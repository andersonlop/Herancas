public class ContaSalario extends Conta{
    private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
