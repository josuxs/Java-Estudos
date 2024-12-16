package aula161224;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		

		Gerente g1 = new Gerente ("Hugo", "2444", 2000.0);
		
		Secretario s1 = new Secretario ("Cecilia", "157", 1050.0);
		
		Diretor d1 = new Diretor ("Gabriel Carlos", "69", 1100.0);
		
		Engenheiro e1 = new Engenheiro ("Josué", "231", 10000.0);
		
        System.out.println("Bonificação para os funcionários: ");
		System.out.println("Gerente Hugo: "+g1.calculaBonificacao());
		System.out.println("Secretária Cecília: "+s1.calculaBonificacao());
		System.out.println("Diretor Gabriel Carlos: "+d1.calculaBonificacao());
		System.out.println("Engnheiro Josué Xavier: "+e1.calculaBonificacao());
	}

}
