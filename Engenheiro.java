package aula161224;

public class Engenheiro extends Funcionario {
	public Engenheiro (String nome, String cpf, Double salario) {
		super(nome,cpf,salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return salario * 0.17;
	}


}
