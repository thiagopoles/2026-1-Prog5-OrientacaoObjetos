
public class Motocicleta {
	private String marca;
	private String placa;
	private int marcha;
	private double speed;

	public Motocicleta(String marca, String placa, int marcha, double speed) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.marcha = marcha;
		this.speed = speed;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
/* ----------------------------------------------------------------------------- */
	public void aumentarMarcha() {
		if (this.marcha < 5) {
			this.marcha = this.marcha + 1;
			System.out.println("Marcha atual é de " + this.marcha);
		} else {
			System.out.println("MArcha máxima atingida! Marcha" + this.marcha);
		}
	}
	public void diminuirMarcha() {
		if (this.marcha > 1) {
			this.marcha = this.marcha - 1;
			System.out.println("Marcha atual é de " + this.marcha);
		} else {
			System.out.println("Marcha mínima atingida! Marcha " + this.marcha);
		}
	}
	public void acelerar() {
		if (this.speed >= 0 && this.speed < 200) {
			this.speed = this.speed + 5;
			System.out.println("A velocidade atual é " + this.speed + " Km/h");
		} else {
			System.out.println("Velociadade Máxima Atingida!");
		}
	}
	public void frear() {
		if (this.speed > 0) {
			this.speed = this.speed - 5;
			System.out.println("A velocidade atual é " + this.speed + " Km/h");
		} else {
			System.out.println("Velocidade Mínima Atingida!");
		}
	}
	public void numPlaca() {
		System.out.println("A placa da Moto é " + this.placa);
	}
}