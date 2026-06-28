import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExcluiServlet")
public class ExcluiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExcluiServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("txNome");
		String precoStr = request.getParameter("txPreco");
		
		float preco = Float.parseFloat(precoStr);
		Produto p = new Produto(nome, preco);

		ProdutoDAO dao = new ProdutoDAO();
		try {
			dao.exclui(p);
			
			response.setContentType("text/html;charset=UTF-8");
			
			response.getWriter().println("<!DOCTYPE html>");
			response.getWriter().println("<html>");
			response.getWriter().println("<head>");
			response.getWriter().println("<meta charset='UTF-8'>");
			response.getWriter().println("<title>Cafeteria - Item Removido</title>");
			response.getWriter().println("<link rel='stylesheet' type='text/css' href='estilo.css'>");
			response.getWriter().println("</head>");
			response.getWriter().println("<body>");
			response.getWriter().println("    <div class='resposta-container'>");
			response.getWriter().println("        <h1>Item removido com sucesso!</h1>");
			response.getWriter().println("<p>O item <strong>" + p.getNome() + "</strong> foi retirado do cardápio.</p>");
			response.getWriter().println("        <br>");
			response.getWriter().println("        <a href='index.html' class='btn-voltar'>Voltar ao Menu</a>");
			response.getWriter().println("    </div>");
			response.getWriter().println("</body>");
			response.getWriter().println("</html>");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>Erro ao carregar o driver do banco de dados.</h1>");
		}
	}
}