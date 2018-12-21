package exercise1;

public class available extends state {

	public available(stock stock) {
		super(stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		System.out.println("available stock");
	}

}
