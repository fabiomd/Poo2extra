package exercise2;

public abstract class factory2D extends factory{
	
	@Override
	public product fabricate() {
		System.out.println("2D object fabricated");
		return fabricate2dObject();
	}
	
	protected abstract product fabricate2dObject();
}
