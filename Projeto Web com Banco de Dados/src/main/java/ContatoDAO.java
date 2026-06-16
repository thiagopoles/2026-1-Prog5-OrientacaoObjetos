import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContatoDAO {
	String url = "jdbc:postgresql://localhost:5432/agenda";
	private Connection connection;
	private String user = "postgres";
	private String senha = "aluno";

	public void cadastra(Contato contato) throws ClassNotFoundException {
		String sql = "insert into Contato(nome,telefone)values(?,?)";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);

			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void exclui(Contato contato) throws ClassNotFoundException {
		String sql = "DELETE FROM contato WHERE nome = ? AND telefone = ?";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);

			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void atualiza(Contato contatoAtual, Contato contatoNovo) throws ClassNotFoundException {
		String sql = "UPDATE contato SET nome = ?, telefone = ? WHERE nome = ? AND telefone = ?";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);

			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contatoNovo.getNome());
			stmt.setString(2, contatoNovo.getTelefone());
			stmt.setString(3, contatoAtual.getNome());
			stmt.setString(4, contatoAtual.getTelefone());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Contato busca(Contato contato) throws ClassNotFoundException {
		String sql = "SELECT * FROM contato WHERE nome = ? AND telefone = ?";
		Contato resultado = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());

			// executa
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				resultado = new Contato(rs.getString("nome"), rs.getString("telefone"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return resultado;
	}

}
