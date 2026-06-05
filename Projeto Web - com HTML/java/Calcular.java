
public class Calcular {
	private float percentual;
	private float numero;

	public Calcular(float percentual, float numero) {
		super();
		this.percentual = percentual;
		this.numero = numero;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public float calcularPercentual() {
		return this.numero + (this.numero * this.percentual / 100);
	}
}
