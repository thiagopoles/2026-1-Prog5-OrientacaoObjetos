
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		String nome;
		float metros;
		float Kg;
		float densidade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.next();
		System.out.print("Digite a metros: ");
		metros = teclado.nextFloat();
		System.out.print("Digite o Kg: ");
		Kg = teclado.nextFloat();
		
		densidade = Kg / metros;

		System.out.println("Seu nome: " + nome);
		System.out.println("Densidade: " + densidade);
	}
}
