package behavioral.designpattern.nullobject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getCustomer() {
		return "The customer does not exits...";
	}

}
