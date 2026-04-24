public class Exercicio3 {

    public String pegarIniciais(String nome) {
        String[] partes = nome.split(" ");
        String resultado = "";

        for (String p : partes) {
            String minusculo = p.toLowerCase();
            if (minusculo.equals("e") || minusculo.equals("do") || 
                minusculo.equals("da") || minusculo.equals("dos") || 
                minusculo.equals("das") || minusculo.equals("de")) {
                continue;
            }

            if (!p.isEmpty()) {
                resultado += p.toUpperCase().charAt(0);
            }
        }
        return resultado;
    }
}