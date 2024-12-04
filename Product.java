package POO;

public class Product {
	public String name; 
	public Double price;
	public Integer quantity;
	
	
	//diferença de método para contrutos
	// construtor atribui as variaveis 
	//contas ou validaçoes 
	
	public Double TotalVaueInStock() {
		return price + quantity;
	}
	
	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void addProducts ( Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}
}
