package exercicio14;


public class TesteVeiculo {

	public static void main(String[] args) {
		
		 	Veiculo meuCarro = new Carro();
	        Veiculo minhaBicicleta = new Bicicleta();

	        // Chamando o método mover para verificar o comportamento polimórfico
	        System.out.println("Comportamento do Carro:");
	        meuCarro.mover();

	        System.out.println("\nComportamento da Bicicleta:");
	        minhaBicicleta.mover();
	    }

}


