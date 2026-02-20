import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		int tabuada;
		int cont;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número que você quer a tabuda: ");
		tabuada = teclado.nextInt();
		
		for (cont=0; cont<=10; cont++) {
			System.out.println(tabuada + " x "+cont+" = "+tabuada * cont);
		}
	}

}
