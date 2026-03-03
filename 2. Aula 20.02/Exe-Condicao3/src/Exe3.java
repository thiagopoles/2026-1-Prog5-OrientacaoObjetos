import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o Primeiro número: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o Segundo número: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.println("O primeiro número é maior que o segundo");
		}else if (n1 == n2) {
			System.out.println("Os números são iguais");
		}else {
			System.out.println("O segundo número é maior que o primeiro");
		}
	}

}
