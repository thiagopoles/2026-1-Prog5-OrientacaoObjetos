public class Cama {

    private boolean deitar;
    private boolean levantar;
    private boolean arrumar;
    private boolean desarrumar;

    public Cama(boolean deitar, boolean levantar, boolean arrumar, boolean desarrumar) {
        this.deitar = deitar;
        this.levantar = levantar;
        this.arrumar = arrumar;
        this.desarrumar = desarrumar;
    }

    public void deitarNaCama() {
        if (deitar) {
            System.out.println("Você deitou na cama.");
        } else {
            System.out.println("Você não quis deitar.");
        }
    }

    public void levantarDaCama() {
        if (levantar) {
            System.out.println("Você levantou da cama.");
        } else {
            System.out.println("Continua dormindo...");
        }
    }

    public void arrumarCama() {
        if (arrumar) {
            System.out.println("Cama arrumada!");
        } else {
            System.out.println("Vadiu! Não arrumou a cama.");
        }
    }

    public void desarrumarCama() {
        if (desarrumar) {
            System.out.println("A cama foi desarrumada.");
        } else {
            System.out.println("A cama continua arrumada.");
        }
    }
}