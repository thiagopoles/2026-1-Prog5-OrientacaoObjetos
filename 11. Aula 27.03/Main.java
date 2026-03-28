import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArCondicionado arPadrao = new ArCondicionado();
        ArCondicionado arPersonalizado = new ArCondicionado(18.0, true, 3); 

        int opcao = 0;

        // Menu de operação para o 'arPersonalizado'
        System.out.println("Bem-vindo ao controle do Ar Condicionado!");
        
        while (opcao != 5) {
            System.out.println("\nMENU:");
            System.out.println("1 - Ligar/Desligar");
            System.out.println("2 - Aumentar Temperatura");
            System.out.println("3 - Definir Temperatura Manual");
            System.out.println("4 - Ver Estado Atual");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    arPersonalizado.ligaDesliga();
                    break;
                case 2:
                    arPersonalizado.aumentarTemp();
                    break;
                case 3:
                    System.out.print("Digite a temperatura desejada: ");
                    double temp = scanner.nextDouble();
                    arPersonalizado.setTemperatura(temp);
                    break;
                case 4:
                    arPersonalizado.estadoAtual();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}