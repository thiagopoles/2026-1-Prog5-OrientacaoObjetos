import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do usuário: ");
		String nome = teclado.next();

		String senha;

		do {
			System.out.println("Digite uma senha de 4 dígitos numéricos: ");
			senha = teclado.next();

			if (senha.length() != 4 || !senha.matches("\\d{4}")) {
				System.out.println("Senha inválida! Digite exatamente 4 números.");
			}

		} while (senha.length() != 4 || !senha.matches("\\d{4}"));

		System.out.println("Digite o nome da página (instagram, google, etc): ");
		String pagina = teclado.next();

		Login login1 = new Login(nome, senha, pagina);

		System.out.println("\nDados informados:");
		System.out.println("Nome: " + login1.getNome());
		System.out.println("Página: " + login1.nomePagina);

		System.out.println("\nPrograma encerrado");
	}
}