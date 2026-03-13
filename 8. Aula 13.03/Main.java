import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tevelisao tv = new Tevelisao("LG", 0, 1, false);
		tv.estadoAtual();
		
		tv.ligadoDesligado();
		
		tv.maisVolume();
		tv.passarCanel();
		tv.menosVolume();
		
		System.out.println("");
		System.out.println("Marca 2 TL");
		tv.setMarca("Sony");
		tv.getMarca();
		
		tv.ligadoDesligado();
		
		tv.estadoAtual();
		
	}

}
