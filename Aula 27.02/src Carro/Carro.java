
public class Carro {
	private String nome;
	private String cor;
	private int velocidade;
	private int marcha;
	public Carro(String nome, String cor, int velocidade, int marcha) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	public Carro() {
		this.velocidade = 0;
		this.marcha = 1;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public void acelerar() {
		this.velocidade = this.velocidade+10;	
	}
	public void frear() {
		this.velocidade = this.velocidade-10; 
	}
	public void aumentarMarcha() {
		if (this.marcha < 5) {
			this.marcha = this.marcha + 1; 
		}
	}
	public void diminuirMarcha() {
		this.marcha = this.marcha-1;
	}
	public void estadoAtual() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Marcha: " + this.marcha);
	}
}




