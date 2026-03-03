import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número qualquer: ");
		valor = teclado.nextInt();
		
		if (valor < 0){
			valor = valor * -1;
		}
		System.out.println("O módulo é: " + valor);
	}
}
