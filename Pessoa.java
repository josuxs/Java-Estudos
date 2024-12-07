package Atividade2;

public class Pessoa {
	public String nome;
	public Integer idade;
	
	public Pessoa (String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fazAniversario () {
		this.idade +=1;
	}

	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
}
