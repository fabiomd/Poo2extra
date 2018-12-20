
public abstract class factory3D extends factory {
	@Override
	public product fabricate() {
		System.out.println("3D object fabricated");
		return fabricate3dObject();
	}
	
	protected abstract product fabricate3dObject();
}
