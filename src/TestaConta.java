public class TestaConta {
    public static void main(String[] args){
        Conta c1 = new Conta(1, 1, "Banco AA", 10.00);
        System.out.print(c1);

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        System.out.println(cc1);

    }
}
