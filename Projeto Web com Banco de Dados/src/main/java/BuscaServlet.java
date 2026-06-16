import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscaServlet")
public class BuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BuscaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String nome = request.getParameter("txNome");
		String telefone = request.getParameter("txTel");
		Contato c = new Contato(nome, telefone);

		ContatoDAO dao = new ContatoDAO();
		try {
			Contato encontrado = dao.busca(c);

			response.setContentType("text/html;charset=UTF-8");
			if (encontrado != null) {
				response.getWriter().println("<h1>Contato Encontrado:</h1>");
				response.getWriter().println("<p>Nome: " + encontrado.getNome() + "</p>");
				response.getWriter().println("<p>Telefone: " + encontrado.getTelefone() + "</p>");
			} else {
				response.getWriter().println("<h1>Contato nao encontrado.</h1>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}