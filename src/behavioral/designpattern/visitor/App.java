package behavioral.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("DESK", 20));
		items.add(new Chair("CHAIR", 30));
		
		double sum = 0;
		ShoppingCartVisitor shoppingCart = new ShopingCart();
		
		for(ShoppingItem shoppingItem: items) {
			sum = sum + shoppingItem.accept(shoppingCart);
		}
		
		System.out.println(sum);
	}
		
	
}
