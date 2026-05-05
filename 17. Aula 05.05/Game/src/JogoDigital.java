
public class JogoDigital extends Jogo {
    String genero;
    public JogoDigital(String nome, String genero) {
        super(nome);
        this.genero = genero;
    }
    public void mostrarDados() {
        mostrarNome();
        System.out.println("Gênero: " + genero);
    }
}
