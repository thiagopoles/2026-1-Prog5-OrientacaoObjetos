import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		int op;
		int index;
		String elemento;

		do {
			System.out.println("==============================");
			System.out.println("Menu Lista");
			System.out.println("1 - Inserir");
			System.out.println("2 - Remover");
			System.out.println("3 - Sair");
			System.out.println("==============================");
			op = teclado.nextInt();

			if (op == 1) {
				System.out.print("1.1 - Qual posição? De 0 à " + lista.size());
				System.out.println("");
				index = teclado.nextInt();
				System.out.print("Insira o valor: ");
				elemento = teclado.next();
				lista.add(index, elemento);
			} else if (op == 2) {
				System.out.println("2.1 - Qual posição? De 0 à " + (lista.size() - 1) + "?");
				index = teclado.nextInt();
				lista.remove(index);
			} else if (op == 3) {
				lista.clear();
			}
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + " - " + lista.get(i));
			}

		} while (op != 3);
	}
}
