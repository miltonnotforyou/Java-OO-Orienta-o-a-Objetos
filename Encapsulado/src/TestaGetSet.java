public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2254);
        //conta.numero + 137;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = "Paulo"; -> se não fosse privado
        //paulo.nome = "Paulo Silveira"; -> se não fosse privado

        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        //agora em 2 linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(paulo);
        System.out.println(titularDaConta);
        System.out.println(conta.getTitular());
    }

}
