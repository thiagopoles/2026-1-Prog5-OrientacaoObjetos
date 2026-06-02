
public class MesaRPG {
	private String nomeCampanha;
	private String sistemaRegras;
	private boolean mesaAtual;
	
	public MesaRPG(String nomeCampanha, String sistemaRegras, boolean mesaAtual) {
		super();
		this.nomeCampanha = nomeCampanha;
		this.sistemaRegras = sistemaRegras;
		this.mesaAtual = mesaAtual;
	}
	
	public String getNomeCampanha() {
		return nomeCampanha;
	}
	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}
	public String getSistemaRegras() {
		return sistemaRegras;
	}
	public void setSistemaRegras(String sistemaRegras) {
		this.sistemaRegras = sistemaRegras;
	}
	public boolean isMesaAtual() {
		return mesaAtual;
	}
	public void setMesaAtual(boolean mesaAtual) {
		this.mesaAtual = mesaAtual;
	}		 
}
