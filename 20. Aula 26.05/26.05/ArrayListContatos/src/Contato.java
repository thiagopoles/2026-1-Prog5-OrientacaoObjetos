import java.util.ArrayList;

public class Contato {
	private String nome;
	private int idade;

	public Contato(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		ArrayList<Contato> listaContato = new ArrayList<Contato>();
		Contato c1 = new Contato("João", 12);
		listaContato.add(c1);
		Contato c2 = new Contato("Pedro", 17);
		listaContato.add(c2);
		
		for(int i = 0; i < listaContato.size(); i++) {
			System.out.println(i +"Nome: "+ listaContato.get(i).getNome());
		}
	}
}
