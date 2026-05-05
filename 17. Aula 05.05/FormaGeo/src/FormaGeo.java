
public abstract class FormaGeo {
	private float area;
	
	public abstract float calcArea();

	public FormaGeo(float area) {
		super();
		this.area = area;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	
}
