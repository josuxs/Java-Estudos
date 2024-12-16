package aula161224;

public class Animal {
	
	protected Double peso;// quem herdar a classe, vai herdar diretamente
	protected Double idade;
	
	public Animal(Double p, Double i) {
		this.peso = p;
		this.idade = i;
	}
	
	public void corre() {
		System.out.println("animal correndo");
	}
	
	public Double getPeso() {
		return this.peso;
	}
	public  Double getIdade() {
		return this.idade;
	}
	

}
