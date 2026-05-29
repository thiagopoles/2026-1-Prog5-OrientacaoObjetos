import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listaBandas = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Mostra o tamanho do ArrayList");
			System.out.println("Tamanho Atual: "+ listaBandas.size());
			
			System.out.println("Digite o Nome da Banda: ");
			listaBandas.add(teclado.nextLine()); // Adiciona um OBJ no ArrayList
		}

		//LISTAR AS BANDAS
		for(int i = 0; i < listaBandas.size(); i++) {
			System.out.println(i +" - "+ listaBandas.get(i));
		}
		System.out.println("Remova um elemento do índice 0 a" + (listaBandas.size()-1));
		listaBandas.remove(teclado.nextInt());
		
		for(int i = 0; i < listaBandas.size(); i++) {
			System.out.println(i +" - "+ listaBandas.get(i));
		}
		//ADICIONANDO UMA BANDA NUMA POSIÇÃO QUALQUER
		System.out.println("Escolha um índice para adicionar de 0 a " +listaBandas.size()+1);
		int indice = teclado.nextInt();
		System.out.println("Digite o nome da banda a ser adicionada: ");
		teclado.nextLine();
		listaBandas.add(indice, teclado.nextLine());
		//LISTAR AS BANDAS DO ARRAY
		for(int i = 0; i < listaBandas.size(); i++) {
			System.out.println(i+ " - "+listaBandas.get(i));
		}
		System.out.println("Digite um nome de uma banda para ser removida: ");
		listaBandas.remove(teclado.nextLine());
		//LISTAR AS BANDAS DO ARRAY
		for(int i = 0; i < listaBandas.size(); i++) {
			System.out.println(i+" - "+listaBandas.get(i));
		}
		// EDITAR O NOME DE UMA BANDA
		System.out.println("Digite o índice da banda que deseja editar: ");
		int indiceEditar = teclado.nextInt();
		teclado.nextLine(); // limpar buffer

		if(indiceEditar >= 0 && indiceEditar < listaBandas.size()) {
		    System.out.println("Digite o novo nome da banda: ");
		    String novoNome = teclado.nextLine();

		    listaBandas.set(indiceEditar, novoNome);

		    System.out.println("Banda atualizada com sucesso!");
		} else {
		    System.out.println("Índice inválido!");
		}

		// LISTAR AS BANDAS ATUALIZADAS
		for(int i = 0; i < listaBandas.size(); i++) {
		    System.out.println(i + " - " + listaBandas.get(i));
		}

	}
	