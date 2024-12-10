package Exercicios10122024;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {
	public String nome;
	public Integer matricula;
	public List<Double> notas;
	
	public Pessoa (String nome,Integer matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new ArrayList<>(); // aqui eu estou colocando notas na lista
	}
	
	public void adicionarNota(Double nota) {
		if (nota >=0 && nota <=10) {
			notas.add(nota);
		}else {
			System.out.println("insira um valor de 0 a 10");
		}
		
	}
	
	 public Double calcularMedia() {
	        if (notas.isEmpty()) {
	            return 0.0; // Evita divisão por zero caso não tenha notas
	        }
	        double soma = 0.0;
	        for (Double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.size();//notas.size() retorna a quantidade de elementos na lista.
	    }
	 
	 public String toString () {
		 return "nome: "+nome +
				 "\nmatrícula: "+matricula+
				 "\nMédia: "+calcularMedia();
	 }

}
