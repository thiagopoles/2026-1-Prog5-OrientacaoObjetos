import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AtualizaServlet")
public class AtualizaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AtualizaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String nomeA = request.getParameter("txNomeA");
		String telA = request.getParameter("txTelA");
		String nomeN = request.getParameter("txNomeN");
		String telN = request.getParameter("txTelN");
		Contato cA = new Contato(nomeA, telA);
		Contato cN = new Contato(nomeN, telN);

		ContatoDAO dao = new ContatoDAO();
		try {
			dao.atualiza(cA, cN);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}