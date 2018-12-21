package exercise1;

public class unavailable extends state {

	public unavailable(stock stock) {
		super(stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		System.out.println("unavailable stock");
	}

}
