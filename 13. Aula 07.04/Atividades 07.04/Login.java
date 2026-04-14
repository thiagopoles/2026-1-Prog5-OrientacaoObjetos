public class Login {
	private String nome;
	private String senha;
	public String nomePagina;

	public Login() {
	}

	public Login(String nome, String senha, String nomePagina) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.nomePagina = nomePagina;

		if (validaLogin()) {
			System.out.println("Sucesso!");
		} else {
			System.out.println("Falha de Login, verifique sua senha!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	private boolean validaLogin() {
		if (this.senha.length() == 4) {
			return true;
		} else {
			return false;
		}
	}
}