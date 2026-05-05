
public final class Triangulo extends FormaGeo {
	private float lado1;
	private float lado2;
	public Triangulo(float area, float lado1, float lado2) {
		super(area);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	@Override
	
	public float calcArea() {
		return (this.lado1*this.lado2)/2;
		}
}
