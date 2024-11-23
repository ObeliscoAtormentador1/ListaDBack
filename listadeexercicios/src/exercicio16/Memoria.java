package exercicio16;

public class Memoria {

	 private String tipo;
	 private int capacidadeGB;

	 public Memoria(String tipo, int capacidadeGB) {
	      this.tipo = tipo;
	      this.capacidadeGB = capacidadeGB;
	 }

	 public String getTipo() {
	      return tipo;
	 }

	 public int getCapacidadeGB() {
	      return capacidadeGB;
	 }

	 public String exibirDetalhes() {
	      return "Memória: " + tipo + ", Capacidade: " + capacidadeGB + " GB";
	 }
	
}
