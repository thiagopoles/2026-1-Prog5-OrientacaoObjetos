import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		int maior;
		int menor;
		int aux; //recebe o valor e guarda ele
		int diferenca;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		maior = teclado.nextInt();
		System.out.print("Digite o segundo valor: ");
		menor = teclado.nextInt();
		
		if (maior < menor) {
			aux = maior;
			maior = menor;
			menor = aux;
		}
		diferenca = maior - menor;
		System.out.println("A diferênça é: " + diferenca);

	}
}
