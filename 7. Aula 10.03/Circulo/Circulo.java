
public class Circulo {
	/* deve conter um atributo double raio
	 * um construtor vazio e outro com parâmetro
	 * metodos get e set 
	 * metodos para calcular a área, diâmetro e circnferência 
	 *  
	 * na main instancie dois circulos, um com parâmetro e outro sem parâmetro */
	
	double raio;
	double area;
	double diametro;
	double circunferencia;
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	public Circulo() {
		
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public void calcArea() {
		System.out.println("Área do Círculo é: " + Math.pow(this.raio, 2) * Math.PI);
	}
	
	public void calcDiametro() {
		System.out.println("Diâmetro do Círculo é: " + this.raio * 2);
	}
	
	public void calcCircunferencia() {
		System.out.println("Circunferência do Círculo é: " + 2 * Math.PI * this.raio);
	}
}
