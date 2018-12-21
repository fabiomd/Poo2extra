package exercise1;
import java.util.ArrayList;

public class store {
	private stock cupsStock = null;	
	private stock bottlesStock = null;
	private stock platesStock = null;
	
	public store() {
		this.fillBottleStock();
		this.fillCupStock();
		this.fillPlateStock();
	}
	
	public void replaceCup(int quantity) {
		for(int i=0;i<quantity;i++) {
			cupsStock.addProduct(new cup());
		}
	}
	
	public void replaceBottles(int quantity) {
		for(int i=0;i<quantity;i++) {
			bottlesStock.addProduct(new bottle());
		}
	}
	
	public void replacePlates(int quantity) {
		for(int i=0;i<quantity;i++) {
			platesStock.addProduct(new plate());
		}
	}
	
	public void sellCup(int quantity) {
		this.sellProduct(cupsStock, quantity);
	}
	
	public void sellBottles(int quantity) {
		this.sellProduct(bottlesStock, quantity);
	}
	
	public void sellPlates(int quantity) {
		this.sellProduct(platesStock, quantity);
	}
	
	private void sellProduct(stock stock, int quantity) {
		if (quantity < 0) {
			System.out.println("Invalid quantity");
			return;
		}
		if (stock.getQuantity() > quantity) {
			for (int i=0; i<quantity; i++) {
				stock.removeProduct();
			}
		}
	}
	
	private void fillCupStock() {
		ArrayList<product> cups = new ArrayList<product>();
		for(int i=0; i< 10;i++) {
			cups.add(new cup());
		}
		cupsStock = new stock(cups);
	}
	
	private void fillBottleStock() {
		ArrayList<product> bottles = new ArrayList<product>();
		for(int i=0; i< 10;i++) {
			bottles.add(new bottle());
		}
		bottlesStock = new stock(bottles);
	}
	
	private void fillPlateStock() {
		ArrayList<product> plates = new ArrayList<product>();
		for(int i=0; i< 10;i++) {
			plates.add(new plate());
		}
		platesStock = new stock(plates);
	}
}
