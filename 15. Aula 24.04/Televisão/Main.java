import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criando o objeto TV
        Tevelisao minhaTv = new Tevelisao("LG", 10, 5, false);
        
        Controle controleRemoto = new Controle(minhaTv);
        
        System.out.println("--- Testando Controle Remoto ---");
        controleRemoto.mostrarStatus();
        
        System.out.println("\nLigando a TV pelo controle...");
        controleRemoto.ligarDesligar();
        
        System.out.print("\nDigite um canal para trocar: ");
        int novoCanal = sc.nextInt();
        controleRemoto.escolherCanal(novoCanal);
        
        controleRemoto.aumentarVolume();
        controleRemoto.proximoCanal();
        
        System.out.println("\n--- Estado Final ---");
        controleRemoto.mostrarStatus();
        
        sc.close();
    }
}