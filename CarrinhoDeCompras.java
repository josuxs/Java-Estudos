package Exercicios10122024;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	    private List<Produto> produtos;

	    public CarrinhoDeCompras() {
	        this.produtos = new ArrayList<>();
	    }

	    // Método para adicionar um produto ao carrinho
	    public void adicionarProduto(Produto produto) {
	        produtos.add(produto);
	        System.out.println(produto.getNome() + " adicionado ao carrinho.");
	    }

	    // Método para remover um produto pelo nome
	    public void removerProduto(String nome) {
	        boolean removido = produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
	        if (removido) {
	            System.out.println(nome + " removido do carrinho.");
	        } else {
	            System.out.println("Produto " + nome + " não encontrado no carrinho.");
	        }
	    }

	    // Método para calcular o valor total do carrinho
	    public double calcularValorTotal() {
	        double total = 0;
	        for (Produto produto : produtos) {
	            total += produto.getPreco();
	        }
	        return total;
	    }

	    // Método para exibir todos os produtos do carrinho
	    public void exibirProdutos() {
	        if (produtos.isEmpty()) {
	            System.out.println("O carrinho está vazio.");
	        } else {
	            System.out.println("Produtos no carrinho:");
	            for (Produto produto : produtos) {
	                System.out.println(produto.toString());
	            }
	        }
	    }
	}