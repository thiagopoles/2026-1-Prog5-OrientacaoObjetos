
public class Aquatico extends Veiculo{
	private String tipoCasco;

	public Aquatico(String motor, int peso, String tipoCasco) {
		super(motor, peso);
		this.tipoCasco = tipoCasco;
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	
}
