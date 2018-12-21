package exercise1;
import java.util.ArrayList;

public class stock {
	private ArrayList<product> products = new ArrayList<product>();
	private state state = new unavailable();

	public stock(ArrayList<product> products) {
		this.products = products;
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
	
	private void updateStockState() {
		if (getQuantity() > 10) 
			state = new available();
		else if (getQuantity() > 0)
			state = new critical();
		else
			state = new unavailable();
		state.describe();
	}
}
