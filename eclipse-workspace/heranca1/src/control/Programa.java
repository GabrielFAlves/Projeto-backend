package control;

// comando para organizar as importações:
// ctrl + shift + o
import model.Aluno;
import model.Professor;

public class Programa {

	public static void main(String[] args) {
		
		// Para instanciar uma classe é necessário informar:
		// o nome da classe, o nome do objeto, o operador new
		// e o nome do método construtor
		Professor prof1 = new Professor();
		prof1.nome = "Talita";
		prof1.matricula = "123";
		
		Professor prof2 = new Professor();
		prof2.nome = "Victor";
		prof2.matricula = "987";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Gabriel";
		aluno1.matricula = "202302858112";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Cesar";
		aluno2.matricula = "202309993367";
		
		System.out.println("Professor 1:");
		System.out.println(prof1.nome);
		System.out.println(prof1.matricula);
		System.out.println(prof1.lancarNota(aluno1.nome, 9.0));
		
		System.out.println("Professor 2:");
		System.out.println(prof2.nome);
		System.out.println(prof2.matricula);
		System.out.println(prof2.lancarNota(aluno2.nome, 7.0));
		
		System.out.println("Aluno 1:");
		System.out.println(aluno1.nome);
		System.out.println(aluno1.matricula);
		System.out.println(aluno1.renovarMatricula(aluno1.matricula));
		
		System.out.println("Aluno 2:");
		System.out.println(aluno2.nome);
		System.out.println(aluno2.matricula);
		System.out.println(aluno2.renovarMatricula(aluno2.matricula));

	}
	
}
