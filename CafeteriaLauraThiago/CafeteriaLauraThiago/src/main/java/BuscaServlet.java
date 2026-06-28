import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscaServlet")
public class BuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String nome = request.getParameter("txNome");
		String precoStr = request.getParameter("txPreco");
		
		float preco = Float.parseFloat(precoStr);
		Produto p = new Produto(nome, preco);

		ProdutoDAO dao = new ProdutoDAO();
		try {
			Produto encontrado = dao.busca(p);

			response.setContentType("text/html;charset=UTF-8");
			if (encontrado != null) {
				response.getWriter().println("<h1>Item Encontrado:</h1>");
				response.getWriter().println("<p>Nome: " + encontrado.getNome() + "</p>");
				response.getWriter().println("<p>Preço: R$ " + encontrado.getPreco() + "</p>");
			} else {
				response.getWriter().println("<h1>Item não encontrado no cardápio.</h1>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}