package exercise2;

public class bottleFactory extends factory3D {

	@Override
	public product fabricate3dObject() {
		System.out.println("bottle fabricated");
		return new bottle();
	}

}
