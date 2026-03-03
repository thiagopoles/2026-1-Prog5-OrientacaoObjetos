import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		float raio;
		float diametro;
		float area;
		float circunferencia;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o raio do circulo: ");
		raio = teclado.nextInt();
		
		diametro = 2 * raio;
		System.out.println("O diâmetro do círculo é: " + diametro);
		
		area = (float) (Math.PI * raio * raio);
		System.out.println("A área do círculo é: " + area);
		
		circunferencia = (float) (2 * Math.PI * raio);
		System.out.println("A circunferência do círculo é: " + circunferencia);
	}

}
