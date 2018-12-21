package exercise1;
import java.util.ArrayList;

public class stock {
	private ArrayList<product> products = new ArrayList<product>();
	private state state = null;

	public stock(ArrayList<product> products) {
		this.products = products;
		new unavailable(this);
	}
	
	public int getQuantity() {
		return products.size();
	}
	
	public void removeProduct() {
		int quantity = getQuantity() - 1;
		if (!stock.class.equals(unavailable.class)) {
			product removedProduct = this.products.get(quantity);
			System.out.println(removedProduct.getClass().getSimpleName() + " removed from stock");
			this.products.remove(quantity);
		}
		updateStockState();
	}
	
	public void addProduct(product product) {
		System.out.println(product.getClass().getSimpleName() + " added on stock");
		this.products.add(product);
		updateStockState();
	}
	
	public void setState(state state) {
		this.state = state;
	}
	
	private void updateStockState() {
		if (getQuantity() > 10) 
			new available(this);
		else if (getQuantity() > 0)
			new critical(this);
		else
			new unavailable(this);
		state.describe();
	}
}
