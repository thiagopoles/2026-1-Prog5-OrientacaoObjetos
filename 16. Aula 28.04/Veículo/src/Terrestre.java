
public class Terrestre extends Veiculo{
	private int quantidadeRodas;

	public Terrestre(String motor, int peso, int quantidadeRodas) {
		super(motor, peso);
		this.quantidadeRodas = quantidadeRodas;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
}
