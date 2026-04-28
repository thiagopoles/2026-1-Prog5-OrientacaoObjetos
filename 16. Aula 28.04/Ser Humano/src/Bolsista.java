
public class Bolsista extends Aluno{
	private String projeto;
	private String disciplina;
	public Bolsista(String nome, int matricula, String projeto, String disciplina) {
		super(nome, matricula);
		this.projeto = projeto;
		this.disciplina = disciplina;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
