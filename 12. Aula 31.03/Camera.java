
public class Camera {
    private int resolucao;

    public Camera() { this.resolucao = 12; }
    public Camera(int resolucao) { 
    	this.resolucao = resolucao; 
    }

    public int getResolucao() { 
    	return resolucao; 
    }
    public void setResolucao(int resolucao) { 
    	this.resolucao = resolucao; 
    }
}