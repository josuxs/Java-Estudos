package aula161224;

public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected Double salario;
	
	
	public Funcionario(String nome, String cpf, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Double calcularBonificacao() {
		return salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public Double calculaBonificacao() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
