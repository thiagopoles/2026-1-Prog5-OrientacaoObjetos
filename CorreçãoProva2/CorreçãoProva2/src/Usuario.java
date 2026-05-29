public class Usuario implements Autenticavel {
	private String senha = "1234";
	private String senhaReal = "5678";
	@Override
	private boolean autenticar(senha) {
		if (senha != senhaReal) {
			return False;
		} else {
			return True;
		}
	}
}