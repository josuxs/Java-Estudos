package aula161224;

public class Zoologico {
	
	private  static Double totalPesoAnimais = 0.0;
	
	public static void pesarAnimal (Animal a) {
		Zoologico.totalPesoAnimais +=a.getPeso();
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal(1.2, 3.2);
		a1.corre();
		
		Animal a2 = new Animal(2.3,1.2);
		a2.corre();
		
		Ave av1 = new Ave (5.0, 1.6);
		av1.corre();
		av1.voar();
		
		
		Zoologico.pesarAnimal(a1);
		Zoologico.pesarAnimal(a2);
	    Zoologico.pesarAnimal(av1);
		
		
		System.out.println(Zoologico.totalPesoAnimais);
	}

}
