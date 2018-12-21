package exercise1;

public abstract class state {
	public state(stock stock) {
		stock.setState(this);
	}
	public abstract void describe();
}
