package Atividade2;
/*Classe: Porta 
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
Métodos: void abre() 
void fecha() 
void pinta(String s) 
boolean estaAberta() 
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, 
altere suas dimensões e use o método estaAberta() para verificar se 
ela está aberta.*/

public class TestaPorta {
	public static void main(String[] args) {
		
		 Porta p1 = new Porta("Cinza", 19.2, 129.3, 12.3);

	        // Testando os métodos da classe Porta
	        System.out.println("Estado inicial da porta: " + p1);

	        // Abrindo a porta
	        p1.abre();
	        System.out.println("A porta está aberta? " + p1.aberta);

	        // Fechando a porta
	        p1.fecha();
	        System.out.println("A porta está aberta? " + p1.aberta);

	        // Alterando a cor diretamente
	        p1.cor = "Azul";
	        System.out.println("Após pintar a porta: " + p1);

	        // Alterando as dimensões diretamente
	        p1.dimensaoX = 20.0;
	        p1.dimensaoY = 130.0;
	        p1.dimensaoZ = 15.0;
	        System.out.println("Nova dimensão atualizada: " + p1);
	}
}
