package aula161224;

public class Gerente extends Funcionario{
	
	public Gerente (String nome, String cpf, Double salario) {
		super(nome,cpf,salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return salario * 0.15;
	}

}
