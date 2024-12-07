package Atividade2;

import java.lang.reflect.UndeclaredThrowableException;

/*Classe: Porta 
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
Métodos: void abre() 
void fecha() 
void pinta(String s) 
boolean estaAberta() 
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, 
altere suas dimensões e use o método estaAberta() para verificar se 
ela está aberta.*/

public class Porta {
	public String cor;
	public Double dimensaoX;
	public Double dimensaoY;
	public Double dimensaoZ;
	public Boolean aberta;
	
	public Porta (String cor, Double dimensaoX, Double dimensaoY, Double dimensaoZ) {
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
		this.aberta = false;
	}
	
	public void fecha() {
		this.aberta = false;
		System.out.println("A porta  foi fechada.");
		
	}
	
	public void abre() {
		this.aberta = true;
		System.out.println("A porta está aberta");
		
	}
	
	public Boolean estaAberta(boolean abre) {
		return this.aberta;
		
	}
	
	public void pintar(String novaCor) {
		this.cor = novaCor;
		System.out.println("A porta foi pintada de"+ novaCor+ ".");
	}
	
	public String toString() {
		return "Porta [cor=" + cor + 
	               ", dimensaoX=" + dimensaoX + 
	               ", dimensaoY=" + dimensaoY + 
	               ", dimensaoZ=" + dimensaoZ + 
	               ", aberta=" + (aberta ? "Sim" : "Não") + "]";
	}

}
