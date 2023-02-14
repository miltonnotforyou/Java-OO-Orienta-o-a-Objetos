
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Primeira conta tem " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);

		primeiraConta.agencia = 146;
		segundaConta.agencia = 146;

		System.out.println("Agora a primeira conta está na agencia " + segundaConta.agencia);
		System.out.println("Agora a segunda conta está na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		} else {
			System.out.println("São contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
