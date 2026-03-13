
public class Tevelisao {
	private String marca;
	private int volume;
	private int canal;
	private boolean ligado;
	
	public Tevelisao(String marca, int volume, int canal, boolean ligado) {
		super();
		this.marca = marca;
		this.volume = volume;
		this.canal = canal;
		this.ligado = ligado;
	}
	public Tevelisao() {
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void maisVolume() {
		if(this.volume < 100) {
			this.volume ++;
			System.out.println("Volume " + this.volume);
		}
	}
	public void menosVolume() {
		if(this.volume > 0) {
			this.volume --;
			System.out.println("Volume " + this.volume);
		}
	}
	public void passarCanel() {
		if(this.canal == 30) {
			this.canal = 1;
			System.out.println("Canal "+ this.canal);
		} else {
			this.canal = this.canal + 1;
			System.out.println("Canal " + this.canal);
		}
	}
	public void voltarCanal() {
		if(this.canal == 1) {
			this.canal = 20;
			System.out.println("Canal "+ this.canal);
		} else {
			this.canal = this.canal - 1;
			System.out.println("Canal " + this.canal);
		}
	}
	public void trocarCanal(int troca) {
		this.canal = troca;
		System.out.println("Canal " + this.canal);
	}
	public void ligadoDesligado() {
		if(this.ligado == true) {
			this.ligado = false;
			System.out.println("TV Desligada");
		} else {
			this.ligado = true;
			System.out.println("TV Ligada");
		}
	}
	public void estadoAtual() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Volume: " + this.volume);
		System.out.println("Canal: " + this.canal);
		System.out.println("Ligado/Desligado: " + this.ligado);
	}
}
