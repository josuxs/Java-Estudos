package Atividade2;

/*public String titular;
	public Integer numero;
	public String agencia;
	public Double saldo;
	public String dataDeAbertura;*/

public class TestaConta {

	public static void main(String[] args) {
	 Conta c1 = new Conta("Josué ", 244, "Banco do Brasil", 2.0, "12/12/93");

	 
	 System.out.println("Conta antes do deposito + "+c1.toString());
	 
	 c1.depositar(100.0);
	 
	 System.out.println("Conta depois do deposito "+ c1.toString());
	 

	}

}
