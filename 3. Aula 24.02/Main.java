import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = teclado.next();
		System.out.println("Digite a matricula do aluno: ");
		int mat = teclado.nextInt();
		
		aluno.setNome(nome);
		aluno.setMatricula(mat);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
	}

}
