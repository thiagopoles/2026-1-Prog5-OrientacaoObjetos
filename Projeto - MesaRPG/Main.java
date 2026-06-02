import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<MesaRPG> listaMesas = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		int op = 0;

		do {
			System.out.println("\n======== MENU - RPG ========");
			System.out.println("1 - Criar");
			System.out.println("2 - Listar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("5 - Sair");
			System.out.println("==============================");
			System.out.print("Opção: ");
			op = teclado.nextInt();
			teclado.nextLine();

			if (op == 1) {
				System.out.print("Nome: ");
				String nome = teclado.nextLine();
				System.out.print("Sistema de Regras: ");
				String sistema = teclado.nextLine();
				System.out.print("A mesa está ativa? (S/N): ");
				String resposta = teclado.nextLine();
				boolean ativa = resposta.equalsIgnoreCase("S");

				listaMesas.add(new MesaRPG(nome, sistema, ativa));
				System.out.println("Sucesso!");

			} else if (op == 2) {
				if (listaMesas.isEmpty()) {
					System.out.println("Lista vazia.");
				} else {
					for (MesaRPG m : listaMesas) {
						System.out.print("Campanha: " + m.getNomeCampanha());
						System.out.print(" | Sistema: " + m.getSistemaRegras());
						if (m.isMesaAtual()) {
							System.out.println(" | Status: Ativa");
						} else {
							System.out.println(" | Status: Inativa");
						}
					}
				}
			} else if (op == 3) {
				if (listaMesas.isEmpty()) {
					System.out.println("Lista vazia.");
				} else {
					System.out.print("Número da mesa: ");
					int indice = teclado.nextInt();
					teclado.nextLine();

					if (indice >= 0 && indice < listaMesas.size()) {
						System.out.print("Novo Nome: ");
						String novoNome = teclado.nextLine();
						System.out.print("Novo Sistema de Regras: ");
						String novoSistema = teclado.nextLine();
						System.out.print("Mesa ativa? (S/N): ");
						String respostaStatus = teclado.nextLine();
						boolean novoStatus = respostaStatus.equalsIgnoreCase("S");

						MesaRPG mesa = listaMesas.get(indice);
						mesa.setNomeCampanha(novoNome);
						mesa.setSistemaRegras(novoSistema);
						mesa.setMesaAtual(novoStatus);
						System.out.println("Atualizada!");
					} else {
						System.out.println("Inexistente.");
					}
				}
			} else if (op == 4) {
				if (listaMesas.isEmpty()) {
					System.out.println("Lista vazia.");
				} else {
					System.out.print("Número da mesa: ");
					int indiceDel = teclado.nextInt();

					if (indiceDel >= 0 && indiceDel < listaMesas.size()) {
						listaMesas.remove(indiceDel);
						System.out.println("Removida!");
					} else {
						System.out.println("Inexistente.");
					}
				}
			} else if (op == 5) {
				System.out.println("Fim.");
			} else {
				System.out.println("Inválido.");
			}

		} while (op != 5);
		teclado.close();
	}
}
