import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer deitar na cama? (sim/nao)");
        boolean deitar = sc.nextLine().equalsIgnoreCase("sim");

        System.out.println("Você levantou da cama? (sim/nao)");
        boolean levantar = sc.nextLine().equalsIgnoreCase("sim");

        System.out.println("Você arrumou a cama? (sim/nao)");
        boolean arrumar = sc.nextLine().equalsIgnoreCase("sim");

        System.out.println("Você desarrumou a cama? (sim/nao)");
        boolean desarrumar = sc.nextLine().equalsIgnoreCase("sim");

        Cama cama = new Cama(deitar, levantar, arrumar, desarrumar);

        System.out.println("\n--- Estado da cama ---");

        cama.deitarNaCama();
        cama.levantarDaCama();
        cama.arrumarCama();
        cama.desarrumarCama();

        sc.close();
    }
}