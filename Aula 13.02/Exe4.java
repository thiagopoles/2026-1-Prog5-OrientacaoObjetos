import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		float DM;
		float Dm;
		float area;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a diagonal maior: ");
		DM = teclado.nextInt();
		System.out.print("Digite a diagonal menor: ");
		Dm = teclado.nextInt();
		
		area = (DM * Dm) / 2;
		
		if (DM < Dm){
			System.out.println("valores não aceitos, tente novamente!");
		} else {
			System.out.println("A área do Losango é: " + area);
		}
	}

}
