public class Exercicio2 {

    public void mostrarPiramide(String palavra) {
        for (int i = 1; i <= palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }

        for (int i = palavra.length() - 1; i >= 1; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }
}