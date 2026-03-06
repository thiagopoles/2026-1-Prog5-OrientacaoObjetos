import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Computador pc1 = new Computador();
		
		System.out.println("---------------------------------------------");
		System.out.print("Entre com o modelo do 1º computador: ");
		pc1.setModelo(teclado.next());
		System.out.print("Entre com a quantidade de memória RAM:  ");
		pc1.setMemoriaRam(teclado.nextInt());
		System.out.print("Entre com a quantidade de memória interna:  ");
		pc1.setMemoriaRam(teclado.nextInt());
		System.out.print("Entre com modelo de Processador:  ");
		pc1.setMemoriaInterna(teclado.nextInt());
		System.out.println("---------------------------------------------");

		System.out.println("");
		
		String modelo;
		int memoriaRam;
		int memoriaInterna;
		String processador;
		
		System.out.println("---------------------------------------------");
		System.out.print("Entre com o modelo do 2º computador: ");
		modelo = teclado.next();
		System.out.print("Entre com a quantidade de memória RAM:  ");
		memoriaRam = teclado.nextInt();
		System.out.print("Entre com a quantidade de memória interna:  ");
		memoriaInterna = teclado.nextInt();
		System.out.print("Entre com modelo de Processador:  ");
		processador = teclado.next();
		Computador pc2 = new Computador(modelo, memoriaRam, memoriaInterna, processador);
		System.out.println("---------------------------------------------");
		
		System.out.println("Modelo: "+pc1.getModelo());
		System.out.println("Memóra RAM: "+pc1.getMemoriaRam());
		System.out.println("Memória Interna: "+pc1.getMemoriaInterna());
		System.out.println("Processador: "+pc1.getProcessador());

		pc2.Configuracao();
	}

}
