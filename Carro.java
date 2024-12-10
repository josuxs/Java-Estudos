package Exercicios10122024;

public class Carro {
	private String modelo;
	private String fabricante;
	private Integer ano;
	
	public Carro (String modelo, String fabricante, Integer ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {// pode modificar o valor
		this.modelo = modelo;
	}

	public String getFabricante() {// retorna ao usuário o que estar aqui dentro
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "modelo: "+ modelo +
			  "fabricante: "+fabricante+
			  "ano: "+ ano;
			  
	}
	
	

}
