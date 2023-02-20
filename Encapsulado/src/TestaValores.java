public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        //conta está inconsistente com o modelo de negócio
        //conta.setAgencia(-50);
        //conta.setNumero(-330);

        System.out.println("A agencia é a " + conta.getAgencia());

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(1337, 14660);
        Conta conta4 = new Conta(1337, 14450);

        System.out.println("Foram criadas " +conta.getTotal() +" contas");
    }

}
