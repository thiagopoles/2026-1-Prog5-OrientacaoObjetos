import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--- Cadastro da Motocicleta ---");
		System.out.print("Marca: ");
		String marca = sc.nextLine();
		System.out.print("Placa: ");
		String placa = sc.nextLine();
		System.out.print("Marcha inicial: ");
		int marcha = sc.nextInt();
		System.out.print("Velocidade inicial: ");
		double speed = sc.nextDouble();
		sc.nextLine();

		Motocicleta m1 = new Motocicleta(marca, placa, marcha, speed);

		System.out.println("\n--- Cadastro do Piloto ---");
		System.out.print("Nome do Piloto: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();

		Piloto p1 = new Piloto(nome, idade, m1);

		System.out.println("\n--- Simulando ---");
		p1.acelerarMoto();
		p1.maisMarcha();
		p1.acelerarMoto();
		p1.frearMoto();
		p1.getMotocicleta().numPlaca();

		sc.close();
	}
}