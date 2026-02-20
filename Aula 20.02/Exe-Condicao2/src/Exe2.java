import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		valor = teclado.nextInt();
		
		if (valor < 0) {
			System.out.println("número negativo");
		} else if (valor == 0) {
			System.out.println("zero");
		} else {
			System.out.println("número positivo");
		}
	}

}
