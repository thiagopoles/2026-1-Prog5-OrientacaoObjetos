import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
		Scanner teclado = new Scanner(System.in);
		int op;
		int i;

		do {
			System.out.println("===================================");
			System.out.println("Menu de Disciplinas");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Listar Todas");
			System.out.println("3 - Buscar");
			System.out.println("4 - Alteração");
			System.out.println("5 - Exclusão");
			System.out.println("6 - Finalizar Programa");
			System.out.print("Sua opção: ");
			op = teclado.nextInt();
			System.out.println("===================================");

			if (op == 1) {
				Disciplina d = new Disciplina();
				System.out.println("Entre com o nome da nova disciplina: ");
				d.setNome(teclado.next());
				System.out.println("Entre com a carga horária da nova disciplina: ");
				d.setCh(teclado.nextInt());
				listaDisciplina.add(d);
			} else if (op == 2) {
				if (!listaDisciplina.isEmpty()) {
				}
				for (i = 0; i < listaDisciplina.size(); i++) {
					System.out.println(i);
					System.out.println(" - " + listaDisciplina.get(i).getNome());
					System.out.println(" / " + listaDisciplina.get(i).getCh());
					System.out.println("===================================");
				}
			} else if (op == 3) {
				if (!listaDisciplina.isEmpty()) {
					System.out.println("Entre com a disciplina a ser buscada: ");
					String nome = teclado.next();
					for (i = 0; i < listaDisciplina.size(); i++) {
						if (nome.equals(listaDisciplina.get(i).getNome())) {
							System.out.println(i);
							System.out.println(" - " + listaDisciplina.get(i).getNome());
							System.out.println(" / " + listaDisciplina.get(i).getCh());
						}
					}
					System.out.println("===================================");
				}
			} else if (op == 4) {
				if (!listaDisciplina.isEmpty()) {
					System.out.println("Entre com a disciplina a ser alterada: ");
					String nome = teclado.next();
					for (i = 0; i < listaDisciplina.size(); i++) {
						if (nome.equals(listaDisciplina.get(i).getNome())) {
							// Faz a alteração aqui
							System.out.println("Entre com a nova carga horária: ");
							listaDisciplina.get(i).setCh(teclado.nextInt());
						}
					}
					System.out.println("===================================");
				}
			} else if (op == 5) {
				if (!listaDisciplina.isEmpty()) {
					System.out.println("Entre com a disciplina a ser removida: ");
					String nome = teclado.next();
					for (i = 0; i < listaDisciplina.size(); i++) {
						if (nome.equals(listaDisciplina.get(i).getNome())) {
							listaDisciplina.remove(i);
						}
					}
					System.out.println("===================================");
				}
			} else if (op == 6) {
				listaDisciplina.clear();
			}

		} while (op != 6);

	}
}