package exercicio16;

public class Computador {

	 private Processador processador;
	    private Memoria memoria;

	    public Computador(Processador processador, Memoria memoria) {
	        this.processador = processador;
	        this.memoria = memoria;
	    }

	    public void exibirCaracteristicas() {
	        System.out.println("Características do Computador:");
	        System.out.println(processador.exibirDetalhes());
	        System.out.println(memoria.exibirDetalhes());
	    }
	
}
