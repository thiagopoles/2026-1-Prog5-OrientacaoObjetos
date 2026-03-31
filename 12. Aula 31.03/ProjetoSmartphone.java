
public class ProjetoSmartphone {
    public static void Main(String[] args) {

    	Smartphone iphone13 = new Smartphone();
        iphone13.setRam(new Ram("LPDDR4X", 4));
        iphone13.setProc(new Processador("Apple", "A15 Bionic", 3.23));
        iphone13.setTela(new Tela(6.1, "2532 x 1170"));
        iphone13.setBateria(new Bateria(3240));
        iphone13.setCamera(new Camera(12));

        System.out.println("DADOS DO IPHONE 13:");
        iphone13.imprimirDados();

        Smartphone s21 = new Smartphone();
        s21.setRam(new Ram("LPDDR5", 8));
        s21.setProc(new Processador("Exynos", "2100", 2.9));
        s21.setTela(new Tela(6.2, "2400 x 1080"));
        s21.setBateria(new Bateria(4000));
        s21.setCamera(new Camera(64));

        System.out.println("DADOS DO SAMSUNG S21:");
        s21.imprimirDados();
    }
}