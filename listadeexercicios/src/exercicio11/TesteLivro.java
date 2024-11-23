package exercicio11;

public class TesteLivro {

	public static void main(String[] args) {
	     // Criando instâncias da classe ex11
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        // Exibindo os detalhes dos livros
        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();
        
        System.out.println("\nDetalhes do Livro 2:");
        livro2.exibirDetalhes();
	}
}
