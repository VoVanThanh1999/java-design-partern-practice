package behavioral.designpattern.visitor;

public class ShopingCart implements ShoppingCartVisitor{

	@Override
	public double visit(Table table) {
		return table.getPrice();
	}

	@Override
	public double visit(Chair chair) {
		return chair.getPrice();
	}

}
