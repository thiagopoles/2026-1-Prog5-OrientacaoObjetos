import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AtualizaServlet")
public class AtualizaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		String nomeA = request.getParameter("txNomeA");
		float precoA = Float.parseFloat(request.getParameter("txPrecoA"));
		
		String nomeN = request.getParameter("txNomeN");
		float precoN = Float.parseFloat(request.getParameter("txPrecoN"));
		
		Produto pAtual = new Produto(nomeA, precoA);
		Produto pNovo = new Produto(nomeN, precoN);

		ProdutoDAO dao = new ProdutoDAO();
		try {
			dao.atualiza(pAtual, pNovo);
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>Item atualizado com sucesso!</h1>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}