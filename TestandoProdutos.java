package POO;

import java.util.Scanner;


public class TestandoProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product ("Josué", 500.0, 15);
		System.out.println("enter product data: ");	
		System.out.println("name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantitu in stock: ");
		product.quantity = sc.nextInt();
        sc.close();
	}

}
