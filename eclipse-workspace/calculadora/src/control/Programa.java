package control;

public class Programa {

	// void quer dizer que o método não tem retorno
	public static void main(String[] args) {
		
		// Exemplo de instanciação de objeto
		// Classe,objeto, operador de instanciação
		// e método construtor
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(1, 2));
		System.out.println(calc.subtrair(1, 2));
		System.out.println(calc.mult(1, 3));
		System.out.println(calc.divisao(1, 2));
	}
}
