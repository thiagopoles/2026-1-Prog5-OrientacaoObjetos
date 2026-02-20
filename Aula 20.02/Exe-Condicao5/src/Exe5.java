import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = teclado.nextInt();
		
		if (num >= 5 && num <= 20) {
			System.out.println("Seu Número está entre 5 e 20.");
		} else {
			System.out.println("Seu número não está entre 5 e 20.");
		}
	}

}
