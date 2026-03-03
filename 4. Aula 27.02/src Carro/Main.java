import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o nome do carro: ");
		c1.setNome(teclado.next());
		
		System.out.println("Entre com a cor do carro: ");
		String cor;
		cor = teclado.next();
		c1.setCor(cor);
		c1.estadoAtual();
		
		int op;
		do {
			System.out.println("Escolha a opcção: ");
			System.out.println("1 - Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3 - Aumentar Marcha");
			System.out.println("4 - Diminuir Marcha");
			System.out.println("5 - Sair");
			op = teclado.nextInt();
			if (op == 1)
				c1.acelerar();
			else if (op == 2) 
				c1.frear();
			else if (op == 3)
				c1.aumentarMarcha();
			else if (op == 4)
				c1.diminuirMarcha();
			else if (op == 5) 
				System.out.println("Programa Finalizado!");
				c1.estadoAtual();
		}while (op != 5);
	}
}
