package aula161224;

public class Diretor extends Funcionario{
	
	public Diretor (String nome, String cpf, Double salario) {
		super(nome,cpf,salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return salario * 0.20;
	}

}
