package aula161224;

public class Ave extends Animal{ // está é a forma da herança
	                             // está é uma subclasse da super classe animal
	 

	public Ave(Double peso, Double idade) {
		super(peso, idade);
	}
	
	public void voar() {
		System.out.println();
	}
	
	public void imprimirDadosAve() {
		System.err.println("Peso: "+this.peso+
				           "Idade: "+this.idade);
	}
}
