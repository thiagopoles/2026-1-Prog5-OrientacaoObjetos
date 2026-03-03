import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		int cont = 0;
		int limite;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um limite para a repetição: ");
		limite = teclado.nextInt();
		
		while (cont <= limite) {
			System.out.println(cont);
			cont ++;
		}
	}

}
