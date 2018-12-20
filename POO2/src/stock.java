import java.util.ArrayList;

public class stock {
	private ArrayList<product> products = new ArrayList<product>();

	public stock(ArrayList<product> products) {
		this.products = products;
	}
	
	public int getQuantity() {
		return products.size();
	}
	
	public void removeProduct() {
		int quantity = getQuantity() - 1;
		if (quantity > 0) {
			product removedProduct = this.products.get(quantity);
			System.out.println(removedProduct.getClass().getSimpleName() + " removed from stock");
			this.products.remove(quantity);
		}
	}
	
	public void addProduct(product product) {
		System.out.println(product.getClass().getSimpleName() + " added on stock");
		this.products.add(product);
	}
}
