package exercise2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factory factory = new cupFactory();
		
		for(int i=0;i<5;i++) {
			factory.fabricate();
		}
		
		factory = new bottleFactory();
		
		for(int i=0;i<5;i++) {
			factory.fabricate();
		}
		
		factory = new plateFactory();
		
		for(int i=0;i<5;i++) {
			factory.fabricate();
		}
	}

}
