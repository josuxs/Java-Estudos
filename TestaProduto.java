package Exercicios10122024;

public class TestaProduto{
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto p1 = new Produto("Arroz", 14.5, Categoria.ALIMENTO);
        Produto p2 = new Produto("Celular", 1500.0, Categoria.ELETRONICO);
        Produto p3 = new Produto("Camiseta", 50.0, Categoria.ROUPA);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        
        carrinho.exibirProdutos();

        // Removendo um produto pelo nome
        carrinho.removerProduto("Celular");

        // Exibindo produtos após remoção
        carrinho.exibirProdutos();

        // Calculando o valor total do carrinho
        double total = carrinho.calcularValorTotal();
        System.out.println("Valor total do carrinho: R$ " + total);
    }
}
