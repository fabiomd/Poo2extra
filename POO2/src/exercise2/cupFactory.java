package exercise2;

public class cupFactory extends factory3D {

	@Override
	public product fabricate3dObject() {
		System.out.println("cup fabricated");
		return new cup();
	}

}
