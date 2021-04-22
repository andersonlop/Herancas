public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int limiteValorSaque;
    private double valorDeposito;
    private double valorSaque;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, int limiteValorSaque, double valorDeposito, double valorSaque) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limiteValorSaque = limiteValorSaque;
        this.valorDeposito = valorDeposito;
        this.valorSaque = valorSaque;
    }

    @Override
    public void Depositar(Double valorD) {
        super.Depositar(valorD);
    }

    @Override
    public void Sacar(Double valorS) {
        super.Sacar(valorS);
    }

    public double getSaldo(){
        return this.chequeEspecial + this.saldo + this.Depositar - this.Sacar;
    }
}
