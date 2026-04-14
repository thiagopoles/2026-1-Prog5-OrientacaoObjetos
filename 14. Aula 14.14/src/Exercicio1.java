public class Exercicio1 {

    public void analisar(String texto) {
        System.out.println("Tamanho: " + texto.length());
        System.out.println("Maiúsculo: " + texto.toUpperCase());
        System.out.println("Minúsculo: " + texto.toLowerCase());

        int contador = 0;
        String letras = texto.toLowerCase();
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Vogais: " + contador);
        System.out.println("Começa com Ins: " + letras.startsWith("ins"));
        System.out.println("Termina com ões: " + letras.endsWith("ões"));
    }
}