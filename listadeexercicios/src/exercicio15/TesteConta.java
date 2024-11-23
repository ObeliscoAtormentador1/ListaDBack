package exercicio15;

public class TesteConta {

	public static void main(String[] args) {
		
		 ContaBancaria minhaConta = new ContaBancaria("12345-6");

	     System.out.println("Número da conta: " + minhaConta.getNumero());
	     System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());

	     minhaConta.depositar(500.0);
	     minhaConta.depositar(150.0);
	     minhaConta.depositar(-50.0);

	       
	    System.out.println("Saldo final: R$" + minhaConta.getSaldo());
	}

}
