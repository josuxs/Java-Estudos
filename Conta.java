package Atividade2;

public class Conta {
	private String titular;
	private Integer numero;
	private String agencia;
	Double saldo;
	private String dataDeAbertura;
	
	public Conta (String titular,Integer numero,String agencia, Double saldo, String dataDeAbertura ) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public Double sacar(Double valor ) {
		 if (valor <= saldo) {
	            saldo -= valor;
	            return saldo;
	        } else {
	            System.out.println("Saldo insuficiente!");
	            return saldo;
	        }
	    }
	
	 public Double depositar(Double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            return saldo;
	        } else {
	            System.out.println("Valor inválido para depósito!");
	            return saldo;
	        }
	    }
	
	public Double  calcularRendimento() {
		return saldo * 0.1;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double setSaldo(Double saldo) {
		return this.saldo = saldo;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public String toString() {
		return
	            " titular= " + titular + '\n' +
	            " numero= " + numero +
	            " agencia= " + agencia + '\n' +
	            " saldo= " + saldo + '\n' + 
	            "dataDeAbertura= " + dataDeAbertura + '\n' +
	            '}';
	}
	
	
	

}
