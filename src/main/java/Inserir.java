import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Inserir extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Inserir</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Inserir " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProdutoDao dao = new ProdutoDao();

		String nome = request.getParameter("nome"), descricao = request.getParameter("descricao");
		int unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
		Float qtdPrevistoMes = Float.parseFloat(request.getParameter("qtd")),
				precoMaxComprado = Float.parseFloat(request.getParameter("precoMaxComprado"));

		try {
			dao.insert(nome, unidadeCompra, descricao, qtdPrevistoMes, precoMaxComprado);
			PrintWriter out = response.getWriter();
			out.println("<html><body><script type='text/javascript'>" + "alert('Inserido');" + "location='Produto.jsp';"
					+ "</script></body></html>");
		} catch (SQLException ex) {
		}

	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
