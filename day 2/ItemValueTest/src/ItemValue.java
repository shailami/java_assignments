
public class ItemValue {
	private int newItem;
	private double newItemPrice;
	private double discount;
	

	public double getNewValue(int input) {
		newItem=input;
		discount=0.35*newItem;
		newItemPrice=newItem-discount;
		System.out.println(newItemPrice);
		return newItemPrice;
	}

}
