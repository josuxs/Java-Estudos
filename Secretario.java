package aula161224;

public class Secretario  extends Funcionario {

	public Secretario (String nome, String cpf, Double salario) {
		super(nome,cpf,salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return salario * 0.12;
	}


}
