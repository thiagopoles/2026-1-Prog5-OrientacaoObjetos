
public class Piloto {
	private String nome;
	private int idade;
	private Motocicleta motocicleta;

	public Piloto(String nome, int idade, Motocicleta motocicleta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.motocicleta = motocicleta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Motocicleta getMotocicleta() {
		return motocicleta;
	}
	public void setMotocicleta(Motocicleta motocicleta) {
		this.motocicleta = motocicleta;
	}
	/* ----------------------------------------------------------------------------- */
	public void acelerarMoto() {
		motocicleta.acelerar();
	}
	public void frearMoto() {
		motocicleta.frear();
	}
	public void maisMarcha() {
		motocicleta.aumentarMarcha();
	}
	public void menosMarcha() {
		motocicleta.diminuirMarcha();
	}
}