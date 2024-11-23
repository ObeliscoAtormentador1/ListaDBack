package exercicio20;

public class Gerente extends Funcionario{

	private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus; 
    }

    @Override
    public String getDetalhes() {
        return "Gerente: " + super.getDetalhes() + ", Bônus: R$" + bonus;
    }
	
}
