import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[] vetor = new int[5];
	
	for(int i = 0; i < 5; i++) {
		System.out.println("Digite o "+ (i + 1) +"número: ");
		vetor[i] = teclado.nextInt();
	}
  }
}
