public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero + 137;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
    }
}
