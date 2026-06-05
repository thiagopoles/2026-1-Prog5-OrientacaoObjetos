
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletLogin
 */
@WebServlet("/ServeletLogin")
public class ServltCalcular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServltCalcular() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String sNum = request.getParameter("txNum");
		String sPerc = request.getParameter("txPerc");

		float fNum = Float.parseFloat(sNum);
		sNum = Float.toString(fNum);
		float fPerc = Float.parseFloat(sPerc);
				
		Calcular c = new Calcular(fNum, fPerc);
		
		float fResultado = c.calcularPercentual();
		String sResultado = Float.toString(fResultado);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>Número: "+ sNum +"</h1>");
		pw.println("<h1>Percentual: "+ sPerc +"</h1>");
		pw.println("<h1>Resultado: "+ sResultado +"</h1>");

	}
}
