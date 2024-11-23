package exercicio17;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		 	Calculadora minhaCalculadora = new Calculadora();

	        double num1 = 12;
	        double num2 = 4;

	        System.out.println("Testando a Calculadora:");

	        System.out.println("Soma: " + minhaCalculadora.somar(num1, num2));

	        System.out.println("Subtração: " + minhaCalculadora.subtrair(num1, num2));

	        System.out.println("Multiplicação: " + minhaCalculadora.multiplicar(num1, num2));

	        try {
	            System.out.println("Divisão: " + minhaCalculadora.dividir(num1, num2));
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("\nTestando divisão por zero:");
	        try {
	            System.out.println("Divisão: " + minhaCalculadora.dividir(num1, 0));
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	 }

}
