package Atividade2;

public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa ("Wanessa", 19);
		System.out.println(p1.toString());
		System.out.println("Agora em 2026");
		
		p1.fazAniversario();
		p1.fazAniversario();
		System.out.println("Depois "+p1);
	}
}
