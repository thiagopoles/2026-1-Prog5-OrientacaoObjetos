import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		int ano;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um ano: ");
		ano = teclado.nextInt();
		
		if (ano % 4 == 0 || ano % 400 == 0) {
			System.out.println("O ano é Bissexto");
		} else {
			System.out.println("O ano não é Bissexto");
		}
	}

}
