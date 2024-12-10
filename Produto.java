package Exercicios10122024;

public class Produto {

    private String nome;
    private Double preco;
    private Categoria categoria;

   
    public Produto(String nome, Double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria; 
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "Preço: " + preco + "\n" +
               "Categoria: " + (categoria != null ? categoria : "Sem categoria");
    }
}
