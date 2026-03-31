
public class Tela {
    private double tamanho;
    private String resolucao;

    public Tela() {
        this.tamanho = 6.1;
        this.resolucao = "FHD";
    }

    public Tela(double tamanho, String resolucao) {
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }

    public double getTamanho() { 
    	return tamanho; 
    }
    public void setTamanho(double tamanho) { 
    	this.tamanho = tamanho;
    }
    public String getResolucao() { 
    	return resolucao; 
    }
    public void setResolucao(String resolucao) { 
    	this.resolucao = resolucao; 
    }
}