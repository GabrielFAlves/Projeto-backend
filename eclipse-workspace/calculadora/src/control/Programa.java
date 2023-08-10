package control;

public class Programa {

	// void quer dizer que o método não tem retorno
	public static void main(String[] args) {
		
		// Exemplo de instanciação de objeto
		// Classe,objeto, operador de instanciação
		// e método construtor
		Calculadora calc = new Calculadora();
		
		double resultado = calc.somar(1, 2);
		
		System.out.println(resultado);
	}
}
