package model;

// extends faz a herança
public class Professor extends Pessoa {
	
	public String lancarNota(String aluno, double nota) {
		return "Nota do aluno " + aluno + " lançada: " + nota;
	}

}
