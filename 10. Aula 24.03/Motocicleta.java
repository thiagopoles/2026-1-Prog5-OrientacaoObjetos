
public class Motocicleta {
	private String marca;
	private int marchaAtual;
	private int velocidade;
	private boolean ligado;
	public Motocicleta(String marca, int marchaAtual, int velocidade, boolean ligado) {
		super();
		this.marca = marca;
		this.marchaAtual = marchaAtual;
		this.velocidade = velocidade;
		this.ligado = ligado;
	}
	public Motocicleta() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public void ligar() {
		if(this.ligado == false) {
			this.ligado = true;
			System.out.println("Moto ligada");
		}else {
			System.out.println("Moto desligada");
		}
	}
	public void aumentaMarcha() {
		if(this.marchaAtual < 6) {
			this.marchaAtual = this.marchaAtual +1;
			System.out.println("A velocidade atual é " + this.marchaAtual);
		}
	}
	public void acelerar() {
		if(this.velocidade > 0) {
			this.velocidade = this.velocidade +1;
			System.out.println("A velocidade atual é " + this.velocidade);
		}else if(this.velocidade < 0) {
			System.out.println("Você não pode retornar velocidade");
		}
	}
	public void frear() {
		this.velocidade = this.velocidade -1;
	}
	public void estadoAtual() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Marcha: " + this.marchaAtual);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Ligado/Desligado: " + this.ligado);
	}
}
	
