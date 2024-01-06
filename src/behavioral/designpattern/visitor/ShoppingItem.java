package behavioral.designpattern.visitor;

public interface ShoppingItem {

	public double accept(ShoppingCartVisitor choppingCartVisitor);
	
}
