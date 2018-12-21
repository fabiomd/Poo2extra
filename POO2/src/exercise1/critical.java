package exercise1;

public class critical extends state {

	public critical(stock stock) {
		super(stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		System.out.println("critical state");
	}

}
