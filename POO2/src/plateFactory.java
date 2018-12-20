
public class plateFactory extends factory2D {

	@Override
	public product fabricate2dObject() {
		System.out.println("plate fabricated");
		return new plate();
	}

}
