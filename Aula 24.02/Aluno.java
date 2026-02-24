//criar a classe aluno
//nome e matriculo
public class Aluno {
	private String nome;
	private int matricula;
	
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
