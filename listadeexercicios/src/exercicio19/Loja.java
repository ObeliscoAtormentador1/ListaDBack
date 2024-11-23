package exercicio19;

public class Loja {

	public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double precoTotal = precoBase * quantidade;
        double desconto = precoTotal * (descontoPercentual / 100);
        return precoTotal - desconto;
    }
	
}
