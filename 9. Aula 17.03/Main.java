import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        MicroOndas m1 = new MicroOndas();
        MicroOndas m2 = new MicroOndas("IFSC", 0, "Gado", false);
        
        int op;
        do {
            System.out.println("\n--- CONFIGURANDO M1 ---");
            System.out.println("1 - Definir Marca");
            System.out.println("2 - Definir Tempo");
            System.out.println("3 - Definir Alimento");
            System.out.println("4 - Ligar/Desligar");
            System.out.println("5 - Sair para ver o M2");
            op = teclado.nextInt();
            teclado.nextLine(); 

            if (op == 1) {
                System.out.println("Marca: ");
                m1.setMarca(teclado.nextLine());
            } 
            else if (op == 2) {
                System.out.println("Tempo: ");
                m1.setTempo(teclado.nextInt());
            } 
            else if (op == 3) {
                System.out.println("Alimento: ");
                m1.setTipoAlimento(teclado.nextLine());
            } 
            else if (op == 4) {
                m1.ligaDesliga();
            }
        } while (op != 5);

        System.out.println("");
        m1.status();

        
        m2.status();
        m2.ligaDesliga();
        m2.maisTempo30();
        
        System.out.println("");
        System.out.println("Alterando Marca do M2");
        m2.setMarca("IFSC");
        m2.getMarca();
        
        m2.ligaDesliga();
        m2.status();

        teclado.close();
    }
}