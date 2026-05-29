public class Alunos {
	private String nome;
	private static int quantidadeAlunos;
	
	public Alunos (String nome) {
		this.nome = nome;
		Alunos.quantidadeAlunos += 1;
		System.out.println(Alunos);
	}
}