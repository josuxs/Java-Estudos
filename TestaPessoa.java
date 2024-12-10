package Exercicios10122024;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa aluno = new Pessoa ("Josué Xavier", 2121);
		
		aluno.adicionarNota(2.1);
		aluno.adicionarNota(10.0);
		aluno.adicionarNota(0.0);
		
		System.out.println(aluno.toString());
	}

}
