
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
		doGet(request, response);
		String nome = request.getParameter("txNome");
		String telefone = request.getParameter("txTel");
		Contato c = new Contato(nome, telefone);

		ContatoDAO dao = new ContatoDAO();
		try {
			dao.exclui(c);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
