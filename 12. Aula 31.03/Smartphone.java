
public class Smartphone {
    private Ram ram;
    private Processador proc;
    private Tela tela;
    private Bateria bateria;
    private Camera camera;

    public Ram getRam() { 
    	return ram; 
    }
    public void setRam(Ram ram) { 
    	this.ram = ram; 
    }
    public Processador getProc() {
    	return proc; 
    }
    public void setProc(Processador proc) {
    	this.proc = proc; 
    }
    public Tela getTela() { 
    	return tela; 
    }
    public void setTela(Tela tela) { 
    	this.tela = tela; 
    }
    public Bateria getBateria() { 
    	return bateria; 
    }
    public void setBateria(Bateria bateria) { 
    	this.bateria = bateria; 
    }
    public Camera getCamera() { 
    	return camera; 
    }
    public void setCamera(Camera camera) { 
    	this.camera = camera; 
    }

    public void imprimirDados() {
        System.out.println("ESPECIFICAÇÕES:");
        System.out.println("Processador: " + proc.getMarca() + " " + proc.getModelo());
        System.out.println("RAM: " + ram.getCapacidade() + "GB");
        System.out.println("Tela: " + tela.getTamanho() + "\" Resolução: " + tela.getResolucao());
        System.out.println("Bateria: " + bateria.getCapacidade() + "mAh");
        System.out.println("Câmera: " + camera.getResolucao() + "MP");
        System.out.println("---------------------------------");
    }
}