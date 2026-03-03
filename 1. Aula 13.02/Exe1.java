import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		int n1;		//Entrada 01
		int n2;		//Entrada 02
		int soma;	//Saída
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o 1º Número: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o 2º Número: ");
		n2 = teclado.nextInt();
		soma = n1 + n2;
		System.out.print("O resultado da soma é: " + soma);
	}

}
