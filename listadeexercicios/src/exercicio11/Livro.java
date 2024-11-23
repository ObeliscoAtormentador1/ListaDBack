package exercicio11;

public class Livro {
	private String autor;
	private String titulo;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas) {
	       this.titulo = titulo;
	       this.autor = autor;
	       this.numeroPaginas = numeroPaginas;
	   }
	   
	    public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public void exibirDetalhes() {
	    System.out.println("Título: " + titulo);
	    System.out.println("Autor: " + autor);
	    System.out.println("Número de Páginas: " + numeroPaginas);
	}
}
	
