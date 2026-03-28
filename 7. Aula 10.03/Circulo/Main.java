import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Circulo c1 = new Circulo();
		double raio;
		
		System.out.println("Digite o raio do Círculo: ");
		raio = teclado.nextDouble();
		c1.setRaio(raio);
		
		c1.calcArea();
		c1.calcCircunferencia();
		c1.calcDiametro();
		
		//divisória
		System.out.println("=========================================");
		
		System.out.println("Digite o raio do círculo: ");
		raio = teclado.nextDouble();
		Circulo c2 = new Circulo(raio);
		c2.calcDiametro();
		c2.calcDiametro();
		c2.calcArea();
		System.out.println("Raio: " + c2.getRaio());
	}
}
