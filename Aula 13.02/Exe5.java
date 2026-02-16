import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		float raio;
		float altura;
		float volume;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o raio do da lata de óleo em cm: ");
		raio = teclado.nextInt();
		System.out.print("Digite o altura do da lata de óleo cm: ");
		altura = teclado.nextInt();
		
		volume = (float) (Math.PI * (raio * raio) * altura)/1000;
		System.out.println("O volume da lata de óleo é: " + volume + "cm³");
	}

}
