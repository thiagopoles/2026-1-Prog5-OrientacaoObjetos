package PacoteSmartphone;

public class Processador {
    private String marca;
    private String modelo;
    private double velocidade;

    public Processador() {
        this.marca = "Genérica";
        this.modelo = "Básico";
        this.velocidade = 2.0;
    }

    public Processador(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() { 
    	return marca; 
    }
    public void setMarca(String marca) { 
    	this.marca = marca; 
    }
    public String getModelo() { 
    	return modelo; 
    }
    public void setModelo(String modelo) { 
    	this.modelo = modelo; 
    }
    public double getVelocidade() { 
    	return velocidade; 
    }
    public void setVelocidade(double v) { 
    	this.velocidade = v; 
    }
}