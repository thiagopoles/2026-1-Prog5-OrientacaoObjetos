import java.util.ArrayList;
import java.util.Scanner;

public class FilaSimples {
    public static void main(String[] args) {
        ArrayList<String> fila = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1-Adicionar | 2-Remover | 3-Sair");
            opcao = Integer.parseInt(leitor.nextLine());

            if (opcao == 1) {
                System.out.print("Valor: ");
                fila.add(leitor.nextLine());
            } else if (opcao == 2) {
                if (!fila.isEmpty()) {
                    fila.remove(0);
                } else {
                    System.out.println("Fila vazia!");
                }
            }

            System.out.println("Fila: " + fila);
        }
        leitor.close();
    }
}