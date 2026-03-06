
public class Computador {
	private String modelo;
	private int memoriaRam;
	private int memoriaInterna;
	private String processador;
	
	public Computador(String modelo, int memoriaRam, int memoriaInterna, String processador) {
		super();
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.memoriaInterna = memoriaInterna;
		this.processador = processador;
	}
	public Computador() {
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	public int getMemoriaInterna() {
		return memoriaInterna;
	}
	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public void Configuracao() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Memóra RAM: "+this.memoriaRam);
		System.out.println("Memória Interna: "+this.memoriaInterna );
		System.out.println("Processador: "+this.processador);
	}
	
	
}
