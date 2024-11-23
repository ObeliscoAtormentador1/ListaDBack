package exercicio20;

public class Funcionario {

	private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getDetalhes() {
        return "Funcionário: " + nome + ", Salário Base: R$" + salarioBase;
    }
	
}
