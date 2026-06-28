import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {
	String url = "jdbc:postgresql://localhost:5432/laurathiago";
	private Connection connection;
	private String user = "postgres";
	private String senha = "aluno";

	public void cadastra(Produto produto) throws ClassNotFoundException {
		String sql = "INSERT INTO produto(nome, preco) VALUES(?, ?)";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getPreco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void exclui(Produto produto) throws ClassNotFoundException {
		String sql = "DELETE FROM produto WHERE nome = ? AND preco = ?";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getPreco()); 
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void atualiza(Produto produtoAtual, Produto produtoNovo) throws ClassNotFoundException {
		String sql = "UPDATE produto SET nome = ?, preco = ? WHERE nome = ? AND preco = ?";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produtoNovo.getNome());
			stmt.setFloat(2, produtoNovo.getPreco()); 
			stmt.setString(3, produtoAtual.getNome());
			stmt.setFloat(4, produtoAtual.getPreco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto busca(Produto produto) throws ClassNotFoundException {
		String sql = "SELECT * FROM produto WHERE nome = ? AND preco = ?";
		Produto resultado = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, senha);
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getPreco());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				resultado = new Produto(rs.getString("nome"), rs.getFloat("preco"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return resultado;
	}
}
