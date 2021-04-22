public class TestaConta {
    public static void main(String[] args){

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00, 8, 500.00, 45.00);
        // System.out.println(cc1);
        System.out.println("Conta Corrente");
        System.out.println("Saldo de R$ "+cc1.saldo);
        System.out.println("Deposito de R$ "+cc1.Depositar);
        System.out.println("Saque de R$ "+cc1.Sacar);
        System.out.println("Limite de saque de R$ "+cc1.getSaldo());
        System.out.println(" ");

        ContaPoupanca p1 = new ContaPoupanca(33, 3, "Banco CCC", 10.00, 20, 0.05, 10);
        System.out.println("Conta Poupança");
        System.out.println("Saldo de R$ "+p1.saldo);
        System.out.println("Limite de saque de R$ "+p1.getSaldo());
        System.out.println(" ");

        ContaSalario s1 = new ContaSalario(44,3,"Banco CCC",500.00,4);
        System.out.println("Conta Salário");
        System.out.println("O saldo de R$ "+s1.getSaldo());
        System.out.println(" ");
    }
}
