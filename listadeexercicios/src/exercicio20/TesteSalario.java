package exercicio20;

public class TesteSalario {

	public static void main(String[] args) {
	        
	     Funcionario funcionario = new Funcionario("Caru", 3000.0);
	     System.out.println(funcionario.getDetalhes());
	     System.out.println("Salário Final: R$" + funcionario.calcularSalario());

	     System.out.println();

	        
	     Gerente gerente = new Gerente("Belveth", 5000.0, 2000.0);
	     System.out.println(gerente.getDetalhes());
	     System.out.println("Salário Final: R$" + gerente.calcularSalario());

	}
}
