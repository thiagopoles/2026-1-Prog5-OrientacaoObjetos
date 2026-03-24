import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Motocicleta m1 = new Motocicleta();
		Motocicleta m2 = new Motocicleta("Triuph", 1, 50, true);
		int i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a marca da moto: ");
		m1.setMarca(teclado.next());
		
				
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("Ligar/desligar moto = 1");
			System.out.println("Acelerar = 2 ");
			System.out.println("Frear = 3");
			System.out.println("Aumentar marcha = 4");
			System.out.println("Reduzir marcha = 5");
			System.out.println("Estado geral = 6");
			System.out.println("Sair = 7");
			i = teclado.nextInt();
			
			if(i==1)
				m1.ligar();
			else if(i==2)
				m1.acelerar();
			else if(i==3)
				m1.frear();
			else if(i==4)
				m1.aumentaMarcha();
			else if(i==5)
				m1.frear();
			else if(i==6)
				m1.estadoAtual();
			else if(i==7)
				System.out.println("Programa finalizado");
				
		}while(i != 7);
		
		m1.estadoAtual();
		m2.estadoAtual();
	}

}