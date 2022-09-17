package mx.uaemex.ing_software2.cosas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<link rel=\"stylesheet\" href=\"Css/Estilo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<img src=\"imagenes/img1.jpg\">");
		pw.println("<h1> Ligas </h1>");
		pw.println("<a href=\"ejemplos.html\">Ejemplos</a>");
		pw.println("</body>");
		pw.println("</html>");

	
	}

}
